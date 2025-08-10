public class SmallestNumberIN {
    public static void main(String args[]) {
        int number[] = {4, 7, 1, 9, 3};  
        int smallest = number[0];       

        for (int i = 1; i < number.length; i++) {
            if (number[i] < smallest) {
                smallest = number[i];
            }
        }

        System.out.println("Smallest number is: " + smallest);
    }
}
