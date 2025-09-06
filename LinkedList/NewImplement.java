package LinkedList;

public class NewImplement {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
        public static class linkedList{
        Node head = null;
        int size;
        Node tail = null;
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
                tail = temp;
            size++;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        int Size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
        public void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null) {
                head = tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size){
                insertAtEnd(val);
                return;
            }
            else if(idx == 0){
                insertAtHead(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("Please Enter The Valid Num : ");
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getElement(int idx){
            Node temp = head;
            if(idx<0 || idx>size){
                System.out.println("Please Enter The Valid Num : ");
            }
            for(int i = 1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
//        ll.display();
//        System.out.println(ll.size());
        ll.insertAt(2,19);
//        ll.display();
        ll.insertAt(0,0);
        ll.display();
        System.out.println();
        System.out.println(ll.getElement(-1));
    }

}
