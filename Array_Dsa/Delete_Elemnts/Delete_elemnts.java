package Array_Dsa.Delete_Elemnts;

public class Delete_elemnts {
    public static void main(String[] args){
        int arr[] = {3,2,2,3};
        int left = 0;
        for(int right = 0;right<arr.length;right++){
            if(arr[right]!=3){
                arr[left] = arr[right];
                left++;
            }
        }
        for(int i=0;i<left;i++){
            System.out.println(arr[i]);
        }
    }
}
