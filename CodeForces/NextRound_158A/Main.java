package CodeForces.NextRound_158A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N= sc.nextInt();
        int K=sc.nextInt();
        int counter =0;
        int [] scores = new int[N];
        for(int i=0 ; i< scores.length ; i++){
            int score= sc.nextInt();
            scores[i]=score;
        }
        int Threshold = scores[K-1];
        for(int score : scores){
            if (score>0 && score >= Threshold){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
