package Recursion.Basic_Recursion_Problems;

import java.util.Scanner;

public class PrintFrom1ToN {
    public static void PrintToN(int N){
        if(N==0){
            return;
        }
        PrintToN(N-1);
        System.out.println(N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PrintToN(N);
    }
}
