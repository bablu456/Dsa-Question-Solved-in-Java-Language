package Array_Dsa;

public class Find_Maximum {
    int Max(int[] arr){
        int max_elemnts = 0;
        for(int i=0;i<arr.length;i++){
            if(max_elemnts<arr[i]){
                max_elemnts = arr[i];
            }
        }
        return max_elemnts;
    }
    public static void main(String[] args){
        Find_Maximum f = new Find_Maximum();
        int[] arr = {12,45,23,67,34};
        int result = f.Max(arr);
        System.out.println(result);
    }
}
