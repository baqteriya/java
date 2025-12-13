import java.util.Scanner;
public class Ajj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%5==0||n%3==0){
            if(!(n%15==0)){
                System.out.println("the number is Divisible by 3 or 5 but not fifteen");
            }else{
                System.out.println("Not matching the required condition");
            }
        }
        
    }
    
}
