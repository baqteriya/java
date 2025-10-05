
import java.util.Scanner;

public class Ac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                System.out.println("Enter marks of subject 1:");
                float sub1=sc.nextInt();
  System.out.println("Enter marks of subject 2:"); 
float sub2=sc.nextInt();
System.out.println("Enter marks of subject 3:"); 
float sub3=sc.nextInt();
System.out.println("Enter marks of subject 4:"); 
float sub4=sc.nextInt();
System.out.println("Enter marks of subject 5:"); 
float sub5=sc.nextInt();
float total=sub1+sub2+sub3+sub4+sub5;
float percentage=(total/500)*100;
System.out.println("\n total marks="+total);
System.out.println("percentage="+percentage+"%");
sc.close();
}
    
}
