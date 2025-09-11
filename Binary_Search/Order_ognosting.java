package Binary_Search;

import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class Order_ognosting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.println("Enter the Size Of The Array : ");
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Value : ");
        int target = sc.nextInt();
        int store = order_binary(arr,target);
        System.out.println("Answer : "+store);
    }

    static int order_binary(int[] arr, int tar) {
        boolean isac = arr[0] < arr[arr.length - 1];
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == tar) {
                return mid;
            }
            if (isac) {
                if (tar > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }else{
                if(tar>arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }

}
