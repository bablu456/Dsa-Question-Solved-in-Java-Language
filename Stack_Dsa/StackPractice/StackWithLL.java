package Stack_Dsa.StackPractice;

import Stack_Dsa.StackLLImplement;

public class StackWithLL {
    public static class Node {
        int val;
        Node next;
        Node (int val){
            this.val = val;
        }
    }
    public static class StackLL{
        Node head = null;
        Node tail = null;
        void push(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else {
                temp.next = head;
                head = temp;
            }
        }
        void pop(){
            int ch = head.val;
            head = head.next;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
        int size(){
            int c = 0;
            Node temp = head;
            while(temp!=null){
                c++;
                temp = temp.next;
            }
            return c;
        }
        int top(){
          return head.val;
        }
    }
    public static void main(String[] args) {
        StackLL l = new StackLL();
        l.push(1);
        l.push(2);
        l.push(3);
//        l.display();
//        System.out.println(l.pop());
        l.pop();
        System.out.println(l.size());
        System.out.println(l.top());
        l.display();
    }
}
