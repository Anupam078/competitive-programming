package CodeForces.Distinct_Split_1791D;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        for(int x = 0 ; x<n ; x++){
            int len = sc.nextInt();
            String str = sc.next();
            int mx=0;
            for (int i = 0; i < len - 1; i++) {
                HashSet<Character> leftSet = new HashSet<>();
                HashSet<Character> rightSet = new HashSet<>();
                for (int j = 0; j <= i; j++) {
                    leftSet.add(str.charAt(j));
                }
                for (int j = i + 1; j < len; j++) {
                    rightSet.add(str.charAt(j));
                }
                int current = leftSet.size() + rightSet.size();
                mx = Math.max(mx, current);
            }
            System.out.println(mx);
        }
    }
}
