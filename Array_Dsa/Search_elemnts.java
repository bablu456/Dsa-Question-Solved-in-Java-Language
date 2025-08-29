package Array_Dsa;

public class Search_elemnts {
    int Search_Count(int[] arr,int search){
        int count= 0;
        for(int i=0;i<arr.length;i++){
            if(search == arr[i]){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args){
        Search_elemnts s = new Search_elemnts();
        int[] arr = {5,10,5,20,5,30,15,5};
        int Search_e = 5;
        int result = s.Search_Count(arr,Search_e);
        System.out.println(result);
    }
}
