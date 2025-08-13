
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("1.Addition(+)");
        System.out.println("2.Sub(-)");
        System.out.println("3.multi(*)");
        System.out.println("4.division(/)");
        System.out.println("5.modulo(%)");
        System.out.println("Enter choice(1-5):");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Result:" + (a + b));
                break;
            case 2:
                System.out.println("Result:" + (a - b));
                break;
            case 3:
                System.out.println("Result:" + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result:" + (a / b));
                } else {
                    System.out.println("Error:Division by Zero");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println("Result:" + (a % b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }

}
