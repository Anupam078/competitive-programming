package CodeForces.Letters_978C_star;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int m = sc.nextInt();

        long [] rooms = new long[n];
        for (int i = 0; i < n; i++) {
            rooms[i] = sc.nextLong();
        }
        long [] roomNo = new long[m];
        for(int i = 0; i < m; i++){
            roomNo[i]=sc.nextLong();
        }

        long [] prefixSum = new long[n];
        prefixSum[0]=rooms[0];
        for(int i =1 ; i<n ; i++){
            prefixSum[i]=prefixSum[i-1]+rooms[i];
        }

        for(long i : roomNo){
            int high=n-1;
            int low=0;
            int mid = low+((high-low)/2);
            int ans=n;
            while (high>=low){
                mid = low+((high-low)/2);
                if(prefixSum[mid]>=i){
                    ans=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            long previous = (ans == 0) ? 0 :  prefixSum[ans - 1];
            System.out.println((ans + 1) + " " + (i - previous));
        }
    }
}
