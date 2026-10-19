package LeetCode.Find_Indices_For_Target_2089;

import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> newNums= new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                newNums.add(i);
            }
        }
        return newNums;
    }
}
