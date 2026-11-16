package Recursion.Basic_Recursion_Problems;

public class CheckSortedArray {
    public static boolean checkSorted(int [] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return checkSorted(arr,index+1);
    }
}
