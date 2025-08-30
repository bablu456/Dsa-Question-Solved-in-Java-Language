package Stack_Dsa;

import java.util.Scanner;
import java.util.Stack;

public class MoveStackInSameOrder {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer> s1 = new Stack<>();
        while(st.size()!=0){
            s1.push(st.pop());
        }
        System.out.println(s1);
    }
}
