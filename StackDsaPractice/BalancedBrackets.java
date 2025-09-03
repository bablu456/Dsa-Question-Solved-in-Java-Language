package StackDsaPractice;

import java.util.*;

public class BalancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> s = new Stack<>();
        int n = str.length();
        int count = 0;
        int c = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='(') {
                s.push(ch);
                count++;
            }else{
                if(s.size()==0) {
                    return false;
                }
                if(s.peek()=='(') s.pop();
                count++;
                c++;
            }
        }
        System.out.println(count-c);
        return s.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String Here : ");
        String st = sc.nextLine();
        System.out.println(isBalanced(st));

    }
}
