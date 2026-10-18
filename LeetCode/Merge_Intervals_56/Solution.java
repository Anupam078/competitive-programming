package LeetCode.Merge_Intervals_56;

import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        int L=intervals[0][0];
        int R=intervals[0][1];
        int [][] list = new int [intervals.length][2];
        int count=0;
        for(int i =1;i<intervals.length;i++){
            if(intervals[i][0]>R){
                list[count][0]=L;
                list[count][1]=R;
                L=intervals[i][0];
                count++;
            }
            R=Math.max(R,intervals[i][1]);

        }
        list[count][0]=L;
        list[count][1]=R;
        return Arrays.copyOf(list, count + 1);
    }
}
