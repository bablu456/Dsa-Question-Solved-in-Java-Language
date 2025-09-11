package Binary_Search;
import java.util.Scanner;
public class binary_practice {
    int Binary_Search(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
          int  mid = start + ( end - target)/2;
            if(target>arr[mid]){
                start = mid +1;
            }else if(target<arr[mid]){
                start = mid -1;
            }else{
                return mid;
            }
        }
        return 0;
    }



    public static void main(String[] args){
        binary_practice b = new binary_practice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Number : ");
        int tar = sc.nextInt();
        int store = b.Binary_Search(arr,tar);
        System.out.println(arr[store]);
    }
}
