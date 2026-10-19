package LeetCode.Count_Primes_204;

import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        if(n<=2){return 0;}
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2; i<=Math.sqrt(n);i++){
            if(isPrime[i]){
                for(int j= i*i ; j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(boolean x: isPrime){
            if(x){
                count++;
            }
        }
        return count;
    }
}
