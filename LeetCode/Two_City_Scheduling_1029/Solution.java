package LeetCode.Two_City_Scheduling_1029;

import java.util.Arrays;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length/2;
        int totalCost=0;
        Arrays.sort(costs, (a, b) ->
                Integer.compare(a[0] - a[1], b[0] - b[1])
        );
        for(int i=0;i<2*n;i++){
            if(i<n){
                totalCost+=costs[i][0];
            }
            else{
                totalCost+=costs[i][1];
            }
        }
        return totalCost;
    }
}
