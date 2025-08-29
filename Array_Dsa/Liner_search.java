package Array_Dsa;

public class Liner_search {
    int liner(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
    return -1;
    }
    public static void main(String[] args){
        Liner_search l = new Liner_search();
        int[] arr = {10,20,30,40,50,60};
        int target = 50;
        int result = l.liner(arr,target);
        System.out.print(result);
    }
}
