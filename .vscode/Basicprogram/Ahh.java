import java.util.*;
public class Ahh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%5==0 &&n% 3==0){
            System.out.println("this is divisible");
        }else{
            System.out.println("This is not divisible");
        }
        
    }
    
}
