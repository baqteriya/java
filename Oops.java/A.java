
abstract class Animal {

    public void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Horse extends Animal {

    @Override

    public void walk() {
        System.out.println("Horse walk on 4 legs");
    }
}

class Dog extends Animal {

    public void eat() {
        System.out.println(" Dog is eating");

    }
}

class A {

    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.walk();
        Dog dog = new Dog();
        dog.eat();
    }
}
