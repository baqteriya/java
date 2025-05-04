
import java.util.Scanner;

class Statement2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even no");
        } else {
            System.out.println("odd no");
        }
    }
}
