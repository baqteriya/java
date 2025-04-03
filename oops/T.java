
class student {

    String name;
    String age;

    public void star() {
        System.out.println(this.name);
        System.out.print(this.age);
    }
}

public class T {

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Ram";
        s1.age = "34";
        s1.star();

    }
}
