package Stack_Dsa;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> l = new Stack<>();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        Stack<Integer> ll = new Stack<>();
        while(l.size()!=0){
            ll.push(l.pop());
        }
        System.out.println("Enter the Elments : ");
        Scanner sc = new Scanner(System.in);
        int elemnts = sc.nextInt();
        l.push(elemnts);
        while(ll.size()!=0){
            l.push(ll.pop());
        }
        System.out.println(l);
    }
}
