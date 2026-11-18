package LeetCode.Reorganize_String_767;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public String reorganizeString(String s){
        HashMap<Character,Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b[1], a[1])
        );
        int maxFreq = 0;
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            maxFreq = Math.max(maxFreq, entry.getValue());
            pq.offer(new int[]{entry.getKey(),entry.getValue()});
        }
        if (maxFreq > (s.length() + 1) / 2) {
            return "";
        }
        int [] previous=null;
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            int [] current = pq.poll();
            sb.append((char) current[0]);
            current[1]--;
            if(previous!=null && previous[1]>0){
                pq.offer(previous);
            }
            previous=current;
        }
        return sb.length() == s.length() ? sb.toString() : "";
    }
}
