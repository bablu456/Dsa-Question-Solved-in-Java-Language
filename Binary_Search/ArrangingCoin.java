package Binary_Search;

public class ArrangingCoin {
    static int arrange(int n){
        int l = 0;
        int r = n;
        while(l<=r){
            int m = l + (r - l) / 2;
            int curr = m *  (m + 1)/2;
            if(curr == n) return m;
            if(curr > n) r = m - 1;
            else{
                l = m + 1;
            }
        }
        return r;
    }
    public static void main(String[] args){
        int num = 10;
        int res = arrange(num);
        System.out.println(res);
    }
}
