package Stack_Dsa;

public class StackUsingLinkedList {
    public static class Node{
        int val;
        Node next;
        Node (int val){
            this.val = val;
        }
    }
    public static class LinkedList {
        Node head = null;
        Node tail = null;
        public void InsertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        public void push(int val) {
            Node temp = new Node(val);
            if (head == null){
                head=tail=temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }
        public int pop(){
            if(head==null) throw new IllegalArgumentException("Stack is empty !! ");
            int data = head.val;
            head = head.next;
            if(head == null){
                tail = null;
            }
            return data;
        }
        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
        public int size(){
            int count = 0;
            Node temp = head;
            while(temp!=null){
                temp = temp.next;
                count++;
            }
            return count;
        }

    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.push(1);
        l.push(2);
        l.push(3);
        l.display();
    }
}
