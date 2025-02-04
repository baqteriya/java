public class Star
 {
    //instance variable
    int a = 10;
    int b = 20;
    int sum = a + b;

    public Star() {//constructor
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Star obj = new Star();//object class direct call constructor
    }
}

