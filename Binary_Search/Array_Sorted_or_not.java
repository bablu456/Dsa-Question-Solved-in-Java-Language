package Binary_Search;
import java.util.Scanner;
public class Array_Sorted_or_not {
        int Incresing_binary(int arr[],int target){
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target>arr[mid]){
                    start = mid +1;
                }else if(target<arr[mid]){
                    end = mid -1;
                } else{
                    return mid;
                }
            }
            return 0;
        }
        int Decreasing_binary(int arr[],int target){
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target>arr[mid]){
                    end = mid -1;
                }else if(target<arr[mid]){
                    start = mid + 1;
                } else{
                    return mid;
                }
            }
            return 0;
        }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Array_Sorted_or_not a = new Array_Sorted_or_not();
        System.out.println("Enter the Size of The array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Number : ");
        int target = sc.nextInt();

        if(arr[0]<arr[size-1]){
            System.out.println("Array is Sorted in Ascending(increasing) order !! ");
            int store = a.Incresing_binary(arr,target);
            System.out.println(arr[store]);
        }else{
            System.out.println("Array is Sorted in Descending (Decreasing) order !! ");
            int store2 = a.Decreasing_binary(arr,target);
            System.out.println(arr[store2]);
        }
    }
}
