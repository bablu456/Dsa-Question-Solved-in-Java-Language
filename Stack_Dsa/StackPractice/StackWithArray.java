package Stack_Dsa.StackPractice;

public class StackWithArray {
    public static class Stack{
    final int stackSize = 10;
    int[] arr = new int[stackSize];
    int size = 0;
    int t = -1;
    void push(int val){
        if(size  == stackSize-1) System.out.println("The Stack Is Full (Stack Overflow) : ");
        else{
            arr[size] = val;
            size++;
        }
    }
    int pop(){
        int ch = 0;
        if(size == 0) System.out.println("The Stack is Already Empty !! ");
        else ch = arr[size-1];
        arr[size--] = 0;
        return ch;
    }
    int top(){
        return arr[size-1];
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    boolean isEmpty(){
        if(size == 0) return true;
        return false;
    }
    }
    public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
//        System.out.println(s.top());
        s.pop();
//        System.out.println(s.top());
        s.display();
        System.out.println(s.isEmpty());
        System.out.println(s.top());
    }
}
