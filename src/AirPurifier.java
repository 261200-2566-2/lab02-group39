import java.text.DecimalFormat;

public class AirPurifier {
    String model;
    String maxAirCleanse;
    String serialNo;
    String Size;
    String sensorQuality;
    String mode; //two modes, auto and timer
    int Price;
    double PM;
    boolean SwitchOn;
    AirPurifier(String model, String mAS, String sNO, String size, String senQual, int Price){
        this.model = model;
        maxAirCleanse = mAS;
        serialNo = sNO;
        this.Size = size;
        sensorQuality = senQual;
        this.Price = Price;
        mode = "auto";
        airPurifierAmount++;
        PM = Math.random() * 500; //random the PM number because we don't have sensor to detect PM value
    }
    AirPurifier(String serialNo){
        this("stock", "120 m^3/hr", serialNo, "medium", "medium", 1499);
    }

    public void turnOn(){
        SwitchOn = true;
    }

    public void turnOff(){
        SwitchOn = false;
    }

    public void setMode(String mode){
        if (SwitchOn) {
            mode = mode.toLowerCase();
            if (!mode.equals("auto") && !mode.equals("timer")) {
                this.mode = "auto";
                return;
            }
            this.mode = mode;
        }
    }

    public double currentPM(){
        if (SwitchOn) {
            DecimalFormat f = new DecimalFormat("#.00");
            return Double.parseDouble(f.format(PM));
        }
        return -1; //Switch is off
    }

    static int airPurifierAmount;
    static int modelAmount;
    static double Rating;
    static int warranty;

    public static int avgPerModel(){
        return airPurifierAmount / modelAmount;
    }
}
