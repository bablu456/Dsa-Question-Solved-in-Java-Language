package LinkedList;

public class Implementation {
    Node head ;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
   static void Show(Node a){
        Node temp = a;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void display(Node head){
        if(head==null) {
            System.out.println((Object) null);
            return;
        }
        display(head.next);
        System.out.println(head.data);
    }
    public static int count(Node head){
        Node temp = head;
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Show(a);
        display(a);
        int result = count(a);
        System.out.println(result);

    }
}
