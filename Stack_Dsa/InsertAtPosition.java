package Stack_Dsa;

import java.util.Stack;

public class InsertAtPosition {
    public static void main(String[] args) {
        Stack<Integer> l = new Stack<>();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        int idx = 2;
        int x = 7;
        Stack<Integer> st = new Stack<>();
        while(!l.isEmpty()){
            st.push(l.pop());
        }
        System.out.println(st);
        while(st.size()>idx){
            int count = 0;
            count++;
            l.push(st.pop());
        }
        l.push(x);
        System.out.println(l);
        while(!st.isEmpty()){
            l.push(st.pop());
        }
        System.out.println(l);
    }
}
