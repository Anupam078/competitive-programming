package CodeForces.Bitpp_282A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int X=0;
        for(int i=0;i<n;i++){
            String stmt = sc.next();
            if (stmt.equals("++X")) {
                ++X;
            } else if (stmt.equals("X++")) {
                X++;
            } else if (stmt.equals("X--")) {
                X--;
            } else {
                --X;
            }
        }
        System.out.println(X);
    }
}
