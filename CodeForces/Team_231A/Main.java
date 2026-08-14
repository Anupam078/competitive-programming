package CodeForces.Team_231A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int count =0;
        for(int i=0 ; i<n ;i++){
            int x=0;
            for(int j=0; j<3 ;j++){
                int bit=sc.nextInt();
                if(bit==1){
                    x++;
                }
            }
            if(x>=2){
                count++;
            }

        }
        System.out.println(count);
    }
}
