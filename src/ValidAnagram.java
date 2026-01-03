// LeetCode 242: Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word.

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s,String t){
    if(s.length() != t.length()) return false;

    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars,tChars);
    }

}
