import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr=new int[n];
        for(int i=0 ; i<n ;i++){
            arr[i]= sc.nextInt();
        }
        int total = 0;
        for(int x: arr){
            total=total+x;
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        int gain=0;
        for(int i=0 ; i<n ;i++){
            gain=gain+arr[i];
            if(gain> total-gain){
                System.out.println(i+1);
                break;
            }

        }
    }
}
