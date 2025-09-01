package Queue;
import java.util.*;
public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        Queue<Integer> a = new ArrayDeque<>();
        while(q.size()!=0){
            a.add(q.remove());
        }
//        System.out.println(a);
        while(a.size()!=0){
            q.add(a.remove());
        }
        System.out.println(q);
    }
}
