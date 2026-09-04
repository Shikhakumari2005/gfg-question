import java.util.*;

class Solution {

    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        // suffixMin[i] = minimum from i to n-1
        int[] suffixMin = new int[n];

        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        int prefixMax = nums[0];

        for (int i = 0; i < n; i++) {
            prefixMax = Math.max(prefixMax, nums[i]);

            int instability = prefixMax - suffixMin[i];

            if (instability <= k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums1 = {5, 0, 1, 4};
        int k1 = 3;

        System.out.println(obj.firstStableIndex(nums1, k1));
        // Output: 3


        int[] nums2 = {3, 2, 1};
        int k2 = 1;

        System.out.println(obj.firstStableIndex(nums2, k2));
        // Output: -1


        int[] nums3 = {0};
        int k3 = 0;

        System.out.println(obj.firstStableIndex(nums3, k3));
        // Output: 0
    }
}
