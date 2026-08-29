package Algorithms.Binary_Search;

public class binarySearch {
    // Iterative approach for binary search algorithm.
    public static int iterativeBinarySearch(int [] nums,int target){
        int low=0;
        int high=nums.length-1;
        int mid = low + ((high-low)/2);
        while (high>=low){
            mid = low + ((high-low)/2);
            if(mid==target){
                return mid;
            } else if (mid>target) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }

    //Recursive approach for binary search.
    public static int recursiveBinarySearch(int [] nums , int target , int low , int high){
        int mid = low + ((high-low)/2);
        if(mid==target){
            return mid;
        } else if (mid>target) {
            recursiveBinarySearch(nums , target , low , mid-1);
        }
        else {
            recursiveBinarySearch(nums,target,mid+1,high);
        }
        return -1;
    }
}
