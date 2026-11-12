package Recursion.Basic_Recursion_Problems;

public class PowerOfN {
    public static long powerN(int a , int n){
        if(n==0){
            return 1;
        }
        return a*powerN(a,n-1);
    }
}
