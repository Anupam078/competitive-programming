package Recursion.Basic_Recursion_Problems;

public class ReverseAnArray {
    public static int[] reverseArray(int [] arr , int left , int right){
        if(left>=right){
            return arr;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        return reverseArray(arr,left+1,right-1);
    }
}
