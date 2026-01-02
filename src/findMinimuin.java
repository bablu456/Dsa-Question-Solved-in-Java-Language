import java.util.Arrays;

public class findMinimuin {
    static int search(int[] arr){
        int left = 0;
        int right = arr.length -1;
//        Arrays.sort(arr);
        while(left<=right){
            int mid = left + (right - left) / 2;
            int target = mid;
              if (arr[mid]<target) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return arr[left];
    }
    public static void main(String[] args){
       int[] arr = {3,4,5,6,7,1,2};
        System.out.println(search(arr));

    }
}
