package Array_Dsa.Rotated_array_serach;

public class rotated_search {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(target == nums[mid]) System.out.println("this is a index : " + mid);
            else if (nums[left] < nums[mid]) {
                if(nums[left] > target){
                    left = mid + 1;
                } right = mid - 1;
            }else{

                    right = mid - 1;

            }
        }
    }
}
