package Array_Dsa;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the Target number : ");
        int target = sc.nextInt();
        boolean ans = linearSearch(num,target);
        System.out.println("the answer is : = "+ans);
    }

        static boolean linearSearch(int[] arr,int target) {
            if (arr.length == 0) {
                return false;
            }
            for (int index = 0; index < arr.length; index++) {
                int element = arr[index];
                if (element == target) {
                    return true;
                }
            }
            return false;
        }

}
