package Recursion.Basic_Recursion_Problems;

import java.util.ArrayList;

public class SubSequences {
    public static void generateSubsequences(
            int[] arr,
            int index,
            ArrayList<Integer> current
    ){
        if (index == arr.length) {
        System.out.println(current);
        return;
        }

        current.add(arr[index]);
        generateSubsequences(arr,index+1,current);
        current.remove(current.size()-1);
        generateSubsequences(arr,index+1,current);
    }
}
