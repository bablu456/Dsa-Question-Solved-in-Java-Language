package Array_Dsa;

public class Find_Minimum {
    int Min(int[] arr){
        int min_elment = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min_elment>arr[i]){
                min_elment = arr[i];
            }
        }
        return  min_elment;
    }
    public static void main(String[] args){
        Find_Maximum f = new Find_Maximum();
        Find_Minimum T = new Find_Minimum();
        int[] arr = {12,45,23,67,34};
        int result = f.Max(arr);
        int result2 = T.Min(arr);
        System.out.println("Maximum : "+result);
        System.out.println("Minimum : "+result2);
    }
}
