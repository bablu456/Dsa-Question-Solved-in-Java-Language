package Array_Dsa;

public class Find_third_Maximum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int max = 0;
        int smax = 0;
        int thirdmax  =  0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i] !=max){
                smax = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>thirdmax && arr[i]!=smax && arr[i]!=max){
                thirdmax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
        System.out.println(thirdmax);

    }
}
