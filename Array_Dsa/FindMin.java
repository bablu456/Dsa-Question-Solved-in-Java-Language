package Array_Dsa;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min = 0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                return arr[i];
            }
        }
        return -1;

    }
}
