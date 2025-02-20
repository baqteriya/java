import java.util.*;
public class Student1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks for math");
        int a =sc. nextInt();
            System.out.println(" Enter marks for pps");
        int b =sc.nextInt();
            System.out.println("Enter marks for english");
        int c=sc.nextInt();
            System.out.println("Enter marks for civil");
        int d=sc.nextInt();
        
        System.out.println("Enter marks for physic");
        int e=sc.nextInt();
        //calculate Average
        int total=a+b+c+d+e;
        double average = total/5.0;
        double percentage =(total / 500.0)*100;
        //output
        System.out.println("total marks: "+ total );
        System.out.println("Average marks:" + average );
        System.out.println("percentage marks:"+ percentage +"%" );

        sc.close();
    }
}
    
