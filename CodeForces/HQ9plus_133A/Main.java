package CodeForces.HQ9plus_133A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        boolean x = false;
        for(int i =0;i<str.length();i++){
            if (str.charAt(i) == 'H' || str.charAt(i) == 'Q' || str.charAt(i) == '9') {
                System.out.println("YES");
                return;
            }
        }
            System.out.println("NO");
    }
}
