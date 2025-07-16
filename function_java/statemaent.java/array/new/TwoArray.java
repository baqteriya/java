
public class TwoArray {

    public static void main(String[] args) {
        int[][] numbers = new int[3][5];
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = value++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
