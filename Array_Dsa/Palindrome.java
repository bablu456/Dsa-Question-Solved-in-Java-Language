package Array_Dsa;

public class Palindrome {
    boolean CheckPalindrome(int[] arr)
    {
        int k = arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[k-i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Palindrome p = new Palindrome();
        int[] arr = {1,2,1};
        boolean result = p.CheckPalindrome(arr);
        System.out.println("They are Palindrome : "+result);
    }
}
