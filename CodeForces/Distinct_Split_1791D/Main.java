package CodeForces.Distinct_Split_1791D;

import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        for(int x = 0 ; x<n ; x++){
            int len = sc.nextInt();
            String str = sc.next();
            int ci=0;
            int cj=0;
            int mx=0;
            int sum=0;
            for(int i=0;i<len;i++){
                if(str.charAt(i)==str.charAt(i+1)){
                    ci++;
                }
                if(str.charAt(len-i-1)==str.charAt(len-i-2)){
                    cj++;
                }
                sum=ci+cj;
                mx=Math.max(sum,mx);
            }
            System.out.println(mx);
        }
    }
}
