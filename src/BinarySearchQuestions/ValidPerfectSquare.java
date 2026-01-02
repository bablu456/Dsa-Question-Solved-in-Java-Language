package BinarySearchQuestions;

public class ValidPerfectSquare {
    public static int valid(int n){
        int l = 0;
        int r = n;
        int mid = 0;
        while(l<=r){
            mid = l + (r - l) / 2;
            int midsquare = mid * mid;
            if(midsquare == n){
                return mid;
            }else if(midsquare > n){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return r;
    }
    public static void main(String[] args){
        int num = 10;
        int res = valid(num);
        System.out.println(res);
    }
}
