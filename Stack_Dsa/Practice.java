package Stack_Dsa;

import java.util.Scanner;
import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> l = new Stack<>();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        l.push(5);
        Stack<Integer> ll = new Stack<>();
        while(l.size()!=0){
            ll.push(l.pop());
        }
        System.out.println(ll);

        Stack<Integer> c = new Stack<>();
        while(ll.size()!=0){
            l.push(ll.pop());
        }
        System.out.println(l);
        System.out.println(ll);
    }

}
