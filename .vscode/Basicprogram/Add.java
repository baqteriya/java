import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost price");
        int cp=sc.nextInt();
        System.out.println("Enter the selling price");
        int sp=sc.nextInt();
        if(sp>cp){
            System.out.println("you Profit is :");
            System.out.println(sp-cp);
        }else{
            System.out.println("you Loss is:");
            System.out.println(cp-sp);
        }
        
    }
    
}
