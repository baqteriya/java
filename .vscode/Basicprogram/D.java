
class D {

    public static void main(String[] args) {
        int a = 9;
        int b = 2;
        boolean c = ++b > a && ++a > b;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }
}
