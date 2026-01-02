import java.util.Scanner;
public class SumNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        while(num <= n){
            sum = sum + num ;
            num = num + 1;
        }
          System.out.println(sum);
    }
    
}
