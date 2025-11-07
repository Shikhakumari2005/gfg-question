class Solution {
    public boolean twoSum(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return false;
    }
}