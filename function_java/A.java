
import java.util.*;

public class A {
    public static int calculateSum(int a,int b)
    {
        int Sum=a+b;
        return Sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int Sum=calculateSum(a,b);
    System.out.println("Sum of 2 number is :"+Sum);
}
}

