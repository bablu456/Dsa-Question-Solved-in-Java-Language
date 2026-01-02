package BinarySearchQuestions;

public class binarySearch2d {
    static boolean searching(int[][] arr , int target){
        int row = arr.length;
        int col = arr[0].length;
        int left = 0;
        int right = row * col - 1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            int midVal = arr[mid / col][mid % col];
            if(midVal == target){
                return true;
            } else if (target>midVal) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 8;
        System.out.println(searching(arr,target));

    }
}
