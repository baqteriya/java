import java.util.*;

public class Function4 {
    public static int calculateproduct(int a,int b) {
return a * b;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("p of 2 number is:"+ calculateproduct(a,b));  
    }
}
