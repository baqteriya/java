public class X {
    public static void main(String args[]){
        int arr[]={45,34,12,67,33};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum element in array:"+min);
    }
}
    

