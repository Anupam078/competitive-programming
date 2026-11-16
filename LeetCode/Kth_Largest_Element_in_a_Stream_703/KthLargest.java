package LeetCode.Kth_Largest_Element_in_a_Stream_703;

import java.util.PriorityQueue;

public class KthLargest {
    public int k;
    PriorityQueue<Integer> pq;
    public KthLargest(int k , int [] nums){
        this.k=k;
        pq=new PriorityQueue<>();
        for(int n : nums){
            pq.offer(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
    }
    public int add(int val){
        pq.offer(val);
        if(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
}
