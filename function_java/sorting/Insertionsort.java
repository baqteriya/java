
class Insertionsort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {7, 8, 3, 1, 2};
        //insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            //placement
            arr[j + 1] = current;

        }

        Insertionsort insertionsort = new Insertionsort();
        {

            insertionsort.printArray(arr);
        }
    }
}
