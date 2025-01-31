
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            int button=sc.nextInt();
            switch(button){
                case 1:
                System.out.println("hello");
                break;
                case 2:
                System.out.println("namste");
                break;
                case 3:
                System.out.println("bonjour");
                break;
                case 4:
                System.out.println("invalid button");
            }
        }
    }
}
