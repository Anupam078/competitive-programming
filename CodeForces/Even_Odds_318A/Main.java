package CodeForces.Even_Odds_318A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        boolean x = n%2==0;

        if(x){
            if(k<=n/2){
                System.out.println((k*2)-1);
            }else{
                System.out.println((k-(n/2))*2);
            }
        }
        else{
            if(k<=(n/2)+1){
                System.out.println((k*2)-1);
            }
            else{
                System.out.println((k-(n/2)-1)*2);
            }
        }
    }
}
