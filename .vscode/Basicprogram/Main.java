public class Main{
    public static void main(String[] args) {
        int arr[]={98,89,43,23,12};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
        System.out.println("maximum element in array:"+max);
    }
    
}
