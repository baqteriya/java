
class Recursion1 {

    public void printNumb(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumb(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        Recursion1 r1 = new Recursion1();
        r1.printNumb(n);
    }
}
