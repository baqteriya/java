public class D {
    public static void main(String[] args) {
        int arr[]={98,89,43,23,12};
        int n=arr.length;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr [j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array is descending order");
        for(int num:arr){
            System.out.println(num +" ");
        }
    }
}
