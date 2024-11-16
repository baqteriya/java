public class Car {
    String name;
    Gear gear;
    Steering steering;

    Car(String name, Gear gear, Steering steering) {
        this.name = name;
        this.gear = gear;
        this.steering = steering;
    }

    public void printCar() {
        System.out.println("********************");
        System.out.println("Car name: " + name);
        gear.printGear();
        steering.printSteering();
    }
    public static void main(String args[]) {
        Gear localAutomaticGear = new Gear("Local brand", "Automatic");
        Steering powerSteering = new Steering("Power steering");
        Car myCar = new Car("Honda", localAutomaticGear, powerSteering);
        myCar.printCar();

        Gear localManualGear = new Gear("Local brand", "Manual");
        Steering hydraulicSteering = new Steering("Hydraulic");
        Car myCar2 = new Car("Audi", localManualGear, hydraulicSteering);
        myCar2.printCar();

        Car myCar3 = new Car("Kia", localAutomaticGear, hydraulicSteering);
        myCar3.printCar();
    }
}
