package BinarySearchQuestions;

public class missingKth {
    static int missing(int[] arr,int k){
        int l = 0;
        int r = arr.length-1;
        int mid = 0;
        while(l<=r){
            mid = l + (r - l) / 2;
            int mis = arr[mid] - (mid + 1);
            if(mis < k){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return l + k;
    }
    public static void main(String[] args){
        int[] num = {1,2,3,5,6};
        int res = missing(num,1);
        System.out.println(res);
    }
}
