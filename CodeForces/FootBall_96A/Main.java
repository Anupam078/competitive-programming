package CodeForces.FootBall_96A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pos=sc.next();
        int result=0;
        int count=0;
        for(int i=1 ; i<pos.length(); i++){
            if(pos.charAt(i)==pos.charAt(i-1)){
                count++;
            }else{
                count=0;
            }
            result=Math.max(result,count);
        }
        if(result>=6){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
