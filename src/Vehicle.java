abstract class Vehicle {
    public int milesToGo;
    public Driver driver;

    public String vehicleType;
    public int driveDistance;
    public int minimumAge;

    public Vehicle() {
        this.milesToGo = 0;
        this.vehicleType = "Unknown";
        this.driveDistance = 0;
        this.minimumAge = 0;


        //System.out.println(this.vehicleType + " created. " + this.milesToGo + " miles to go!");
    }

    public void drive() {
        if (this.driver == null) {
            System.out.println(this.vehicleType + " didn't drive - there's no driver!");
        }
        else {
            milesToGo -= driveDistance;
            System.out.println(vehicleType + " drove " + driveDistance +
                    " miles - " + milesToGo + " miles to go");
        }

    }
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
