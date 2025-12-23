// used function add two number
class Calculator{
    public int add(int num1, int num2){
        if(num2 == 0){
            return 0;
        }
       int total = num1 + num2;
       return total;
    }
    
    public int subtract(int num1, int num2){
        int total = num1 - num2;
        return total;
    }
    
    public int multiply(int num1, int num2){
        int total = num1 * num2;
        return total;
    }
    
    public int divide(int num1, int num2){
        int total = num1 / num2;
        return total;
    }
    
  public static void main(String args[]){
      Calculator calculator = new Calculator();
      int total = calculator.add(13 , 10);
      System.out.println("Total = " + total);
      int total2 = calculator.subtract(16 , 6);
      System.out.println("Total2 = " + total2);
      int total3 = calculator.multiply(4 , 2);
      System.out.println("Total3 = " + total3);
      int total4 = calculator.divide(12 , 2);
      System.out.println("Total4 = " + total4);
      int total5 = calculator.add(2 , 0);
      System.out.println("Total5 = " + total5);
  }
}