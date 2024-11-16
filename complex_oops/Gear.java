public class Gear {
    String brand;
    String type;

    Gear(String brand, String type){
        this.brand = brand;
        this.type = type;
    }

    public void printGear() {
        System.out.println("Gear brand: " + brand + ";\t type: " + type + ";\t Made by Riya & Co.");
    }
}
