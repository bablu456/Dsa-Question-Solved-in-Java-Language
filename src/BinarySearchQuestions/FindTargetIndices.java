package BinarySearchQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndices {
    public static List<Integer> findIndex(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        int l = 0;
        int r = arr.length - 1;
        int mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (arr[mid] == target){
                list.add(mid);
            } else if (arr[mid+1] == target) {
                list.add(mid+1);
            }else if(arr[mid-1] == target){
                list.add(mid -1);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] num = {1,2,5,2,3};
        int target = 2;
        Arrays.sort(num);
//        System.out.println(findIndex(num));
    }

//    private static boolean findIndex(int[] num) {
//    }
}
