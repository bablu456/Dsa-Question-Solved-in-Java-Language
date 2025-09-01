package Queue;

public class arrayImplementation {
    public static class queueA{
        int f = 0;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];
        public void add(int val){
            if(size == arr.length-1) System.out.println("The Queue Is Full !! ");
            if(f == -1) f = r = 0;
            else{
                arr[++r] = val;
            }
            size++;
        }
        public void remove(){
            if(size == 0){
                System.out.println("Queue is Empty !! ");
                return;
            }
            f++;
            size--;
        }
        public int peek(){
            if(size == 0){
                System.out.println();
                return -1;
            }
            return arr[f];
        }
        public void display(){
            if(f>r){
                System.out.println("Queue is Empty !! ");
                return;
            }else{
                for(int i = f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args){
        queueA a= new queueA();
        a.add(1);
        a.add(2);
        a.add(3);
        a.remove();

        a.display();
        System.out.println(a.size);

    }

}
