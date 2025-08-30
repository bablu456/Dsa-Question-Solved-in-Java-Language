package Stack_Dsa;

public class ArraysStack {
    static final int size = 5;
   static int[] arr = new int[size];
   static int peek = -1;
    static int s = -1;
    static void push(int val){
        if(s == arr.length){
            System.out.println("Stack Overflow !! ");
        }else{
            arr[s++] = val;
            peek = val;
        }
    }
   static void display(){
        for(int i=0;i<s;i++){
            System.out.println(arr[i]);
        }
    }
    static int getPeek(){
        return peek;
    }
    static int pop(){
        peek = arr[s-1];
        arr[s-1] = 0;
        return peek;
    }
   static boolean isEmpty(){
        return s == 0;
    }
    public static void main(String[] args) {
        push(5);
        push(4);
//        display();
//        System.out.println(getPeek());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(isEmpty() );
    }
}
