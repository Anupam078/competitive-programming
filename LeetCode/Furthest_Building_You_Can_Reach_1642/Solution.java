package LeetCode.Furthest_Building_You_Can_Reach_1642;

import java.util.PriorityQueue;

public class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0 ;i<heights.length-1;i++){
            if(heights[i]>heights[i+1]){
            }else{
                pq.offer(heights[i+1]-heights[i]);
                if(pq.size()>ladders){
                    if(pq.peek()<=bricks){
                        bricks-=pq.peek();
                        pq.poll();
                    }
                    else{
                        return i;
                    }
                }
            }
        }
        return heights.length - 1;
    }
}
