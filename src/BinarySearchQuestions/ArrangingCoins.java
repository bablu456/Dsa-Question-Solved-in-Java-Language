package BinarySearchQuestions;

public class ArrangingCoins {
    static int Arrange(int n){
        int l = 0;
        int r = n;
        int mid = 0;
        while(l<=r){
            mid =  l + (r - l) / 2;
            int curr = mid * (mid + 1) / 2;
            if(curr == n){
                return mid;
            }
            else if(curr > n){
                r = mid - 1;
            }
            else l = mid + 1;
        }
        return r;
    }
    public static void main(String[] args){
        int num = 8;
        System.out.println(Arrange(num));
    }
}
