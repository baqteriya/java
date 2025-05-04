
class B {

    public static void main(String[] args) {
        int a = 9;
        int b = a++ + ++a - a--;
        System.out.println(a);
        System.out.println(b);
    }
}
