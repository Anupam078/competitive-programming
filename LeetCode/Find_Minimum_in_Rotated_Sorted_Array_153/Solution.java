package LeetCode.Find_Minimum_in_Rotated_Sorted_Array_153;

class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(nums[mid]<=nums[high] && nums[mid]>=nums[low]){
                return nums[low];
            }
            if(nums[mid]>=nums[low]){
                low=mid+1;
            }
            else if(nums[mid]<=nums[high]){
                high=mid;
            }
        }
        return nums[low];
    }
}
