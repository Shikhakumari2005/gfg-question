import java.util.*;

public class Main {

    static int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // Put all elements in HashSet
        for (int x : arr) {
            set.add(x);
        }

        int longest = 0;

        for (int x : set) {

            // x is the starting point of a sequence
            if (!set.contains(x - 1)) {

                int current = x;
                int length = 1;

                // Find consecutive elements
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int ans = longestConsecutive(arr);

        System.out.println("Longest consecutive sequence length = " + ans);
    }
}
