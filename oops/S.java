
class person {

    String name;

    public person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(this.name);
    }

}

public class S {

    public static void main(String[] args) {
        person name1 = new person("Mohan");
        person name2 = new person("Rohan");

        name1.display();
        name2.display();

    }
}
