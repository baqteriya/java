
import java.util.Scanner;

class Scan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first character: ");
        char a = sc.next().charAt(0);

        System.out.print("Enter second character: ");
        char b = sc.next().charAt(4);

        System.out.print("Enter third character: ");

        char c = sc.next().charAt(6);
        System.out.println("Characters entered are: '" + a + "', '" + b + "', '" + c + "'");

    }
}
