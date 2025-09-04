package PracticeDsa;

public class FullLinkedList {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
        public static class LinkedList{
            Node head = null;
            Node tail = null;
            int size = 0;
            void insertAtHead(int data){
                Node temp = new Node(data);
                if(head == null){
                    head = tail = temp;
                }else{
                    temp.next = head;
                    head = temp;
                    size++;
                }
            }
            void pop(){
                head = head.next;
                size--;
            }
            void insertAtTail(int data){
                Node temp = new Node(data);
                if(head == null){
                    head = temp;
                }
                else{
                    tail.next = temp;
                }
                    tail = null;
                size++;
            }
            void display(){
                Node temp = head;
                while(temp!=null){
                    System.out.println(temp.val);
                    temp = temp.next;
                }
            }
            void insertA(int idx,int val){
                Node t = new Node(val);
                Node temp = head;
                if(idx == size){
                    insertAtTail(val);
                    return;
                }else if(idx == 0){
                    insertAtHead(val);
                }else if(idx<0 || idx>size){
                    System.out.println("Please Enter The Valid Num : ");
                }
                for(int i=1;i<=idx-1;i++){
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
                size++;
            }
            int getElements(int idx){
                Node temp = head;
                if((idx < 0) || (idx > size)){
                    System.out.println("Please Enter The Valid Index Num : ");
                }
                for(int i=1;i<=idx;i++){
                    temp = temp.next;
                }
                return temp.val;
            }

        }


    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAtHead(1);
        l.insertAtHead(2);
        l.insertAtHead(3);
        l.insertAtTail(4);
        l.pop();
//        l.display();
        l.insertA(1,5);
        l.display();
    }
}
