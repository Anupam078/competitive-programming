package LeetCode.Maximun_Unit_on_a_Truck_1710;

import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int totalUnits=0;
        int boxes=0;
        Arrays.sort(boxTypes, (a, b) ->
                Integer.compare(b[1],a[1])
        );
        for(int i=0;i<boxTypes.length;i++){
            if(boxes<=truckSize){
                totalUnits+=boxTypes[i][1]*Math.min(boxTypes[i][0],(truckSize-boxes));
                boxes+=Math.min(boxTypes[i][0],(truckSize-boxes));
            }
        }
        return totalUnits;
    }
}
