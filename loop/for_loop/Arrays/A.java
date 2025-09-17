public class A {
    public static void main(String[] args) {
        int arr[]={23,12,44,65,34};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double average=(double)sum/arr.length;
    System.out.println("average of array element:"+average);
}
}
