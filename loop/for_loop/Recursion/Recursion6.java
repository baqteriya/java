
class Recursion6 {

    public static int Calcpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xpownm1 = Calcpower(x, n - 1);
        int xpown = x * xpownm1;
        return xpown;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = Calcpower(x, n);
        System.out.println(ans);
    }
}
