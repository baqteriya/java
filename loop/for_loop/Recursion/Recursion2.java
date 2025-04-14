

class Recursion2 {

    public void printNumb(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNumb(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        Recursion2 r2 = new Recursion2();
        r2.printNumb(n);
    }
}
