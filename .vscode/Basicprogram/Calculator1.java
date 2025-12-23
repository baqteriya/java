// used function add two number
class Calculator1{
    public int add(int num1, int num2){
       int total = num1 + num2;
       System.out.println(num1 + " + " + num2 + " = " + total);
       return total;
    }
    
    public int subtract(int num1, int num2){
        int total = num1 - num2;
        System.out.println(num1 + " - "
        + num2 + " = " + total);
        return total;
    }
    
    public int multiply(int num1, int num2){
        int total = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + total);
        return total;
    }
    
    public int divide(int num1, int num2){
         if(num2 == 0){
            System.out.println(num1 + " / " + num2 + " = " + 0);
            return 0;
        }
       
        int total = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + total);
        return total;
    }
    
  public static void main(String args[]){
      Calculator1 calculator = new Calculator1();
      int total = calculator.add(23 , 10);
      int total2 = calculator.subtract(16 , 6);
      int total3 = calculator.multiply(4 , 2);
      int total4 = calculator.divide(12 , 2);
      int total5 = calculator.divide(2 , 0);
      int total6 = calculator.divide(6 , 2);
      int total7 = calculator.divide(8 , 2);
      int total8 = calculator.divide(12 , 2);
      int total9 = calculator.divide(6 , 3);
   
  }
}