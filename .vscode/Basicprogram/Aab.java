import java.util.Scanner;

public class Aab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle");
        float p=sc.nextFloat();
        System.out.println("Enter the interest");
        float r=sc.nextFloat();
        System.out.println("Enter the time");
        float t=sc.nextFloat();
        float s1=(p*r*t)/100;
        System.out.println("Principle"+p);
        System.out.println("Rate"+r);
        System.out.println("Time"+t);
        System.out.println("Simple Interest"+s1);

    }
    
}
