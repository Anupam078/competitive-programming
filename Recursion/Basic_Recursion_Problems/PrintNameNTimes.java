package Recursion.Basic_Recursion_Problems;

import java.util.Scanner;

public class PrintNameNTimes {
    public static void PrintName(int N){
        if(N==0){
            return;
        }
        System.out.println("Anupam");
        PrintName(N-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        PrintName(N);
    }
}
