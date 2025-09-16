public class R {
     public static void main(String args[]){
        int arr[]={45,34,12,67,33};
        System.out.println("origanal Array:");
        for(int i:arr){
            System.out.print(i+"");
        }
        int start=0, end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
        System.out.println("\nReversed Array:");
        for(int i:arr){
            System.out.print(i+"");
        }
    }

}