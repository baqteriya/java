
class Recursion3 {

    public void printsum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printsum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        Recursion3 r3 = new Recursion3();
        r3.printsum(1, 5, 0);
    }
}
