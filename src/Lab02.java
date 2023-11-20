public class Lab02 {
    public static void main(String[] args){
        AirPurifier ap = new AirPurifier("21a69");
        AirPurifier.airPurifierAmount = 9001;
        AirPurifier.modelAmount = 4;
        AirPurifier.Rating = 5;
        AirPurifier.warranty = 3;
        ap.turnOn();
        ap.setMode("timer");
        ap.turnOff();
        ap.setMode("auto");
        ap.turnOn();

        System.out.println(AirPurifier.avgPerModel());

        System.out.println(ap.mode);
        System.out.println(ap.currentPM());
    }
}
