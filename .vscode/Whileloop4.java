
import java.util.Scanner;

class Whileloop4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i + "even no");
            } else {
                System.out.println(i + "odd no");
            }
            i++;

        } while (i <= n);
    }

}
