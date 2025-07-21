
class Animal {

    String name;
    String food;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    Animal(String name, String food) {
        this.name = "Dog";
        this.food = "bread";
    }
}

public class B {

    public static void main(String args[]) {
        Animal A1 = new Animal("Dog", "Bread");
        A1.printInfo();
    }
}
