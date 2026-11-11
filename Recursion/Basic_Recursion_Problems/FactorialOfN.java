package Recursion.Basic_Recursion_Problems;

import java.util.Scanner;

public class FactorialOfN {
    public static long Factorial(int N){
        if(N==0){
            return 1;
        }
        return N*Factorial(N-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Factorial(num));
    }
}
