package CodeForces.String_Task_118A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String originalStr= sc.nextLine();
        StringBuilder sb = new StringBuilder(originalStr);
        sb = new StringBuilder(sb.toString().toLowerCase());
        for(int i = sb.length() - 1; i >= 0; i--){
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o'  ||  sb.charAt(i)=='u'  ||  sb.charAt(i)=='y'){
                sb.deleteCharAt(i);
            }
        }

        int n=sb.length()*2;
        for(int i = 0 ; i<n;i+=2){
            sb.insert(i,'.');
        }

        String newString = sb.toString();
        System.out.println(newString);
    }
}
