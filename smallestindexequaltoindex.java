import java.util.*;

public class Main {

    public static int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];
            int sum = 0;

            // Calculate sum of digits
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            // Check sum == index
            if (sum == i) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 2};

        int ans = smallestIndex(nums);

        System.out.println(ans);
    }
}
