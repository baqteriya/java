public class Ae {
    public static void main(String[] args) {
        // precedence & Associativity
        int a=6*5-34/2;
        /*
        highest precedence goes to * and/.they are then evaluated on the basis 
        of left to right associativity
         =30-34/2
         =30-17
         =13
         */
        int b=60/5-34*2;
        /*
         =12-34*2
         =12-68
         =-56
         */
    
        System.out.println(a);
        System.out.println(b);
        //quick quiz
    

    }
    
}
