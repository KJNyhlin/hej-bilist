public class Car extends Vehicle {
    int minimumAge;
    String vehicleType;
    int milesToGo;
    int driveDistance;

    public Car() {
        super();
        minimumAge = 18;
        vehicleType = "Car";
        milesToGo = 100;
        driveDistance = 10;
        System.out.println(vehicleType + " created. " + milesToGo + " miles to go!");
    }

    @Override
    public void drive() {
        if (this.driver == null) {
            System.out.println(this.vehicleType + " didn't drive - there's no driver!");
        } else {
            this.milesToGo -= this.driveDistance;
            System.out.println(this.vehicleType + " drove " + this.driveDistance +
                    " miles - " + this.milesToGo + " miles to go");
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
