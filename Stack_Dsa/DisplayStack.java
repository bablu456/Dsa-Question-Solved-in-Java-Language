package Stack_Dsa;

import java.util.Stack;

public class DisplayStack {
    public static void diplayRec(Stack<Integer> s){
        if(s.isEmpty()) return;
//        s.push(6);
        int top = s.pop();
        System.out.println(top);
        diplayRec(s);
        s.push(top);


    }
    public static void main(String[] args) {
        Stack<Integer> l = new Stack<>();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        l.push(5);
        diplayRec(l);

//        Stack<Integer> st = new Stack<>();
//        while(!l.isEmpty()){
//            st.push(l.pop());
//        }

    }
}
