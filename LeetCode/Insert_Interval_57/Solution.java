package LeetCode.Insert_Interval_57;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(newInterval.length==0){
            return intervals;
        }
        List<int[]> result = new ArrayList<>();
        boolean inserted  = false;
        for (int[] interval : intervals) {
            if(interval[1]<newInterval[0]){
                result.add(interval);
            } else if (interval[0]<=newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
            else{
                if(!inserted){
                    result.add(newInterval);
                    inserted=true;
                }

                result.add(interval);
            }
        }
        if(!inserted){
            result.add(newInterval);
        }
        return result.toArray(new int[result.size()][]);
    }
}

