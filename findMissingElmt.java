import java.util.*;

public class Main {

    static int findMissing(int[] arr, int n) {
        int xor = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor = xor ^ i;
        }

        // XOR all elements of array
        for (int x : arr) {
            xor = xor ^ x;
        }

        return xor;
    }

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};

        int n = arr.length;  // numbers are from 0 to n

        int missing = findMissing(arr, n);

        System.out.println("Missing element = " + missing);
    }
}
