import java.util.Scanner;
public class Acc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
          n= n*(-1);
        }
        System.out.println("The absolute value is:"+n);
    }
    
}
