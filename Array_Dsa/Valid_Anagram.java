package Array_Dsa;

import java.util.Arrays;

public class Valid_Anagram {
    static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
public static void main(String[] args){
    String first = "listen";
    String Second = "silent";
    boolean result = isAnagram(first,Second);
    System.out.println("The Angaram Is Palindrome : "+result);

}
}
