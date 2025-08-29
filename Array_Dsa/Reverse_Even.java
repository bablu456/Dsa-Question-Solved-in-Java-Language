package Array_Dsa;

public class Reverse_Even {
    void Reverse(int[] arr){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            while(i<j && arr[i]%2!=0)
                i++;
            while(i<j && arr[j]%2!=0){
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args){
        int[] arr = {12,15,24,31,46,53};
        Reverse_Even r = new Reverse_Even();
        r.Reverse(arr);
    }
}
