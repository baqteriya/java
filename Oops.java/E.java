
interface Animal {

    int eyes = 2;

    void eat();
}

interface Herbivore {
}

class Dog implements Animal, Herbivore {

    public void eat() {
        System.out.println("Dog is eating");
    }
}

public class E {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
