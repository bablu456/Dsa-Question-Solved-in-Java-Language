package GrindingQuestions;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int maxLength = 0;

        while(right < s.length()){
            char ch = s.charAt(right);

            if(!set.contains(ch)){
                set.add(ch);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String s = sc.nextLine();

        int result = lengthOfLongestSubstring(s);

        System.out.println("Lenght of longest SubString "+result);

        sc.close();
    }
}
