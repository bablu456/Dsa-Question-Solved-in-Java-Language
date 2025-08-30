package Stack_Dsa;

public class StackLLImplement {
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
        int s = 0;
        void push(int val){
            Node temp = new Node(val);
            if(head == null) {
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
                s++;
            }
        }
        void pop(){
            head = head.next;
            s--;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
        int size(){
            return s;
        }
        boolean isEmpty(){
            return s == 0;
        }
    }
    public static void main(String[] args) {
        StackLL s = new StackLL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
//        s.display();
        s.pop();
        s.display();
//        System.out.println(s.size());
    }
}
