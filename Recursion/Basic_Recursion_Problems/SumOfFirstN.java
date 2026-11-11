package Recursion.Basic_Recursion_Problems;

import java.util.Scanner;

public class SumOfFirstN {
    public static int SumOfN(int N){
        if(N==0){
            return 0;
        }
        return N+SumOfN(N-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(SumOfN(num));
    }
}
