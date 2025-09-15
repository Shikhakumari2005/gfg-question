class Solution {
    public boolean twoSum(int[] nums, int target) {
        HashSet<Integer> arr=new HashSet<>();  //create a set
        for(int i=0; i<nums.length;i++){
            int complement =target-nums[i];
            if(set.contain(complement)){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }