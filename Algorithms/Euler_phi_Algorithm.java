package Algorithms;

public class Euler_phi_Algorithm{
    private static final Euclidean_Algorithm euclidean = new Euclidean_Algorithm();
    public static int phi(int n) {
        int count=0;
        for (int i = 1; i < n; i++) {
            if (euclidean.GCD(n, i) == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(phi(6));
    }
}