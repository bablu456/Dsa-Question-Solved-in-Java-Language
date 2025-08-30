package Stack_Dsa;
import java.util.*;
public class BasicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(98);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println("Size is : "+st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.isEmpty());
    }
}
