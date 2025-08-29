package Array_Dsa;
import java.util.Scanner;
public class Maximum_Swap {
    public static void main(String[] args){
        int arr[] = {2,7,3,2};
        int max = 0;
        int store = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                store = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[store];
        arr[store] = temp;
        for(int val : arr){
            System.out.println(val);
        }
    }
}
