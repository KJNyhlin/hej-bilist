public class MilitaryTank extends Vehicle {
    int minimumAge = 25;
    String vehicleType = "Tank";
    int milesToGo = 2000;
    int driveDistance = 5;

    public MilitaryTank() {
        super();
        System.out.println(vehicleType + " created. " + milesToGo + " miles to go!");
    }
    @Override
    public void drive() {
        if (this.driver == null) {
            System.out.println(this.vehicleType + " didn't drive - there's no driver!");
        } else {
            milesToGo -= driveDistance;
            System.out.println(vehicleType + " drove " + driveDistance +
                    " miles - " + milesToGo + " miles to go");
        }
    }
    @Override
    public void setDriver(Driver driver) {
        if (driver.age < minimumAge) {
            System.out.println("Driver not changed! " + driver.name + " is " +
                    driver.age + ", but must be " + minimumAge +
                    " or older to drive " + vehicleType.toLowerCase());
        }
        else {
            this.driver = driver;
            System.out.println("Driver changed to " + this.driver.name);
        }
    }
}
