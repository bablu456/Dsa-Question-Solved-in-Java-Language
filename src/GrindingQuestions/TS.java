package GrindingQuestions;

public class TS {
    public int[] twoSum(int[] num,int target){
        for(int i=0;i< num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){

        TS ts =new TS();
        int[] num = {1,2,3,4,5};
        int target = 7;

        System.out.println(ts.twoSum(num,target));
    }
}
