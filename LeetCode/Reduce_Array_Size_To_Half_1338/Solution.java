package LeetCode.Reduce_Array_Size_To_Half_1338;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        /*freq = freq.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));

        int setCount=0;
        int reducedSize=0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(arr.length- reducedSize<= arr.length/2){
                return setCount;
            }
            reducedSize+= entry.getValue();
            setCount++;
        }
        return setCount;*/
        int setCount=0;
        int reducedSize=0;

        ArrayList<Integer> frequencies = new ArrayList<>(freq.values());
        frequencies.sort(Collections.reverseOrder());
        for(int num : frequencies){
            if(arr.length- reducedSize<= arr.length/2){
                return setCount;
            }
            reducedSize+= num;
            setCount++;
        }
        return setCount;
    }
}
