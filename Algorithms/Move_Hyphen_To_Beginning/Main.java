package Algorithms.Move_Hyphen_To_Beginning;

import java.util.Scanner;

public class Main {
    public static String moveHyphen(String str){
        int n = str.length();
        int count=0;
        for(int i=0 ; i<n ; i++){
            if(str.charAt(i)=='~'){
                count++;
            }
        }

        str=str.replace("~","");
        return "~".repeat(count) + str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(moveHyphen(str));
    }
}
