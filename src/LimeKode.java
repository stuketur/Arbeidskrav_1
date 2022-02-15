/*public class LimeKode {
    static void displayAllCars() {
        TeslaModelX tmx = new TeslaModelX();
        TeslaModelS tms = new TeslaModelS();
        TeslaModelSPlaid tmsp = new TeslaModelSPlaid();
        BMWiX bmwix = new BMWiX();
        BMW3Series bmw3 = new BMW3Series();
        AudiETron audiE = new AudiETron();

        Car[] allCars = {
                tmx,
                tms,
                tmsp,
                bmwix,
                bmw3,
                audiE
        };

        for (Car car : allCars) {
            System.out.println("Make: "+car.getMake());
            System.out.println("Model: "+car.getModel());
            System.out.println("Year: "+car.getYear());

            if (car instanceof ElectricCar) {
                System.out.println("Range: "+((ElectricCar) car).getRange() + "km");
            }

            System.out.println("Horsepower: " + car.getHp() + "hp");
            System.out.println("0-100km/h: "+car.getAcceleration() + "s");
            System.out.println("1/4 mile: " + car.getQuarterMile() + "s");
            System.out.println("-------------------");
        }
    }

    public interface ElectricCar {

    int getRange();
    void setRange(int range);
}
}*/
