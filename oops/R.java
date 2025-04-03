
class pen {

    String color;
    String type;//gel;ballpoint

    public void write() {
        System.out.println("writing something");
    }

}

public class R {

    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();

    }
}
