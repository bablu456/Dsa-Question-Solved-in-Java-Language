package Stack_Dsa;

import java.util.Stack;

public class DecodeAString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        char[] ch = s.toCharArray();
        Stack<Character> l = new Stack<>();
        for(int i=0;i<ch.length;i++){
           l.push(ch[i]);
        }
        System.out.println(l);
    }
}
