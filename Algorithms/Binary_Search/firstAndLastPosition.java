package Algorithms.Binary_Search;

public class firstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1, -1};
        }
        if(lowerBound(nums,target)==nums.length){
            return new int[]{-1, -1};
        }
        if(nums[lowerBound(nums,target)]!=target){
            return new int[]{-1, -1};
        }
        return new int []{lowerBound(nums,target),floor(nums,target)};
    }

    public int lowerBound(int [] nums ,int n){
        int ans = nums.length;
        int high = nums.length-1;
        int low=0;
        int mid = low + ((high-low)/2);
        while(high>=low){
            mid = low + ((high-low)/2);
            if (nums[mid]>=n){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int floor(int [] nums, int x){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] <= x) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
