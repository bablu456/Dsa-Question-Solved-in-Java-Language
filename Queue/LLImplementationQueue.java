package Queue;

public class LLImplementationQueue {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
        public static class queueLL{
            Node head = null;
            Node tail = null;
            int size = 0;

            public void add(int val){
                Node temp = new Node(val);
                if(size == 0){
                    head = tail = temp;
                }else{
                    tail.next = temp;
                    tail = temp;
                }
                    size++;
            }
            public int remove(){
                if(size == 0){
                    System.out.println("The queue Is Empty (UnderFlow) !! ");
                    return -1;
                }
                int v = head.data;
                head = head.next;
                size--;
                return v;
            }
            public void display(){
                if (size == 0) {
                    System.out.println("Queue is Empty !! ");
                    return;
                }
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp = temp.next;
                }
            }
            public int peek(){
                if(size == 0){
                    System.out.println("Queue is Empty !! ");
                    return -1;
                }
                return head.data;
            }
        }

    public static void main(String[] args) {
        queueLL n = new queueLL();
        n.add(1);
        n.add(2);
        n.add(3);
        n.display();
        System.out.println(n.remove());
        System.out.println(n.peek());
    }
}
