package Array_Dsa;
import java.util.*;
public class Move_Zero {
    void zero_move(int[] arr){
        int left = 0;
        for(int right = 1;right<arr.length;right++){
            if(arr[right]!=0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
        for(int val : arr){
            System.out.println(val);
        }
    }
    public static void main(String[] args){
        Move_Zero m = new Move_Zero();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of The Array  : ");
        int size = sc.nextInt();
        int arr[] = {0,1,0,3,12};
        System.out.println("Lets Intialize The Values in The Array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        m.zero_move(arr);
    }

}
