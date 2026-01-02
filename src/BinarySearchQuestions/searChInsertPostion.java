package BinarySearchQuestions;

public class searChInsertPostion {
    public static int SearchIndex(int[] arr,int target){
        int l = 0;
        int r = arr.length-1;
        int mid = 0;
        while(l<=r){
            mid = l + (r - l) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]> target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6};
        int target = 4;
        System.out.println(SearchIndex(arr,target));
    }
}
