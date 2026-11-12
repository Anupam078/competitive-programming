package Recursion.Basic_Recursion_Problems;

import java.util.Scanner;

public class SumOfDigit {
    public static int digitSum(int num){
        if(num/10==0){
            return num;
        }
        return num%10 + digitSum(num/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(digitSum(num));
    }
}
