package Recursion;

public class Reverse_Array {
    public static int [] reverseArray(int [] arr , int  l, int r){
        if(l>=r){
            return arr;
        }
        int temp=0;
        temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return reverseArray(arr,l+1,r-1);
    }
}
