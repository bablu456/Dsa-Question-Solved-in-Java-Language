package BinarySearch;

public class Binarysearch {
    public int search(int[] nums,int target){
        int start = 0;
        int end = nums.length -1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid]<target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Binarysearch solver = new Binarysearch();
        int[] nums = {-1,0,3,5,9,12};

        int target = 9;
        System.out.println("Find "+target + ": Index "+solver.search(nums,target));
    }

}
