public class Z {
    public static void main(String[] args) {
        String str="madam";
        boolean ispalindrome=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str. length()-i-1)){
                ispalindrome=false;
                break;

            }
        }
        if(ispalindrome){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}
