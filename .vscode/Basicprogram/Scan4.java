
import java.util.Scanner;

class Scan4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//num=588
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10;//num=0
                count++;//count=3
            }
        }
        System.out.println(count);//3
    }
}
