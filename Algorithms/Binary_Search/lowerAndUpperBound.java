package Algorithms.Binary_Search;

public class lowerAndUpperBound {
    public static int lowerBound(int [] nums ,int n){
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
}
