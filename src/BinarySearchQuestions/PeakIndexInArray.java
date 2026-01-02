package BinarySearchQuestions;

public class PeakIndexInArray {
    public static int PeakIndex(int[] num){
        int l = 0;
        int r = num.length-1;
        int mid = 0;
        int ans = 0;
        while(l<=r){
            mid = l + (r - l) / 2;
            if(num[mid] < num[mid+1] && num[mid] < num[mid-1]){
                ans = mid;
                return mid;
            } else if (num[mid] < num[mid-1]) {
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return num[ans];
    }
    public static void main(String[] args){
        int[] n = {5,4,3,2,1,2,3,4,5};
        System.out.println(PeakIndex(n));

    }
}
