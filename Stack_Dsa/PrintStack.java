package Stack_Dsa;

import java.util.Stack;

public class PrintStack {
    public static void main(String[] args) {
        Stack<Integer> l = new Stack<>();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
//        for (Integer integer : l) {
//            System.out.println(integer);
//        }
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(l.size()-1-i));
        }
//        System.out.println(l.s());
     }
}
