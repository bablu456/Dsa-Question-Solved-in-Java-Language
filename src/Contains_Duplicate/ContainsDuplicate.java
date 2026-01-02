package Contains_Duplicate;
// LeetCode Problem 217: Contains Duplicate
// Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    return true;
//                }
//            }
//        }

        HashSet<Integer> see = new HashSet<>();

        for(int num : nums){
            if(see.contains(num)){
                return true;
            }
            see.add(num);
        }

        return false;
    }
}
