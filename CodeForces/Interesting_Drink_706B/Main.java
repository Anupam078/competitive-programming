package CodeForces.Interesting_Drink_706B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] prices = new int[n];
        for(int i = 0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        Arrays.sort(prices);
        int q=sc.nextInt();
        int [] coins = new int[q];
        for (int i =0 ; i<q ; i++){
            coins [i] = sc.nextInt();
        }
        for(int c : coins){
            int low =0;
            int high =n-1;
            int ans =n;
            while(high>=low){
                int mid =low+((high-low)/2);
                if(prices[mid]>c){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            System.out.println(ans);
        }

    }
}
