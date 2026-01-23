package GrindingQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static int[] twosum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0 ;i<nums.length;i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter traget value: ");
        int target = sc.nextInt();

        int[] result = twosum(nums, target);

        if(result[0] !=-1){
            System.out.println("Indices: "+result[0] + " "+result[1]);
        }else{
            System.out.println("No two sum solution found. ");
        }

        sc.close();
    }
}
