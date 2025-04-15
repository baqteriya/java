
public class Recursion4 {

    public static int Calcufactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_n = n * Calcufactorial(n - 1);
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = Calcufactorial(n);
        System.out.println(ans);
    }
}
