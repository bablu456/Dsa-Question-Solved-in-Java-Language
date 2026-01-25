package GrindingQuestions;

import java.util.Scanner;
import java.util.Stack;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;

        while(curr !=null){
            Node next = curr.next;
            curr.next  = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp !=null){
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter node values: ");

        for(int i =0 ;i< n;i++){
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.print("Original List");
        printList(head);

        head = reverseList(head);

        System.out.print("Reversed List");
        printList(head);

        sc.close();
    }
}
