
class J {

    public static void main(String[] args) {
        int a = 10;
        a = a << 2;
        a = a >> 1;
        a = ++a << 2;
        a = a++ >> 1;
        System.out.println(a);
    }
}
