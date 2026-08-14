package CodeForces.WayToLongWord_71A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            String InpStr = sc.next();
            if(InpStr.length() > 10){
                // Added "" + to force string concatenation instead of ASCII addition
                System.out.println("" + InpStr.charAt(0) + (InpStr.length()-2) + InpStr.charAt(InpStr.length()-1));
            } else {
                System.out.println(InpStr);
            }
        }

        sc.close();
    }
}