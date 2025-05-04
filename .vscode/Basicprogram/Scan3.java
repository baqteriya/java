
import java.util.Scanner;

class Scan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); // 942
        int num2 = sc.nextInt(); // 513
        int num3 = sc.nextInt(); // 427

        int d1 = num1 / 100;
        int d2 = (num2 / 10) % 10;
        int d3 = num3 % 10;
        int d4 = num1 % 10;

        int result = d1 * 1000 + d2 * 100 + d3 * 10 + d4;

        System.out.println("Final 4-digit number: " + result);
    }
}
