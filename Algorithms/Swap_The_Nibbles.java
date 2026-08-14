package Algorithms;

public class Swap_The_Nibbles {
    public static int Swap(int num){
        int temp1=(num&15)<<4;
        int temp2=(num&240)>>4;
        return temp1 | temp2;
    }

    public static void main(String[] args) {
        System.out.println(Swap(100));
    }
}
