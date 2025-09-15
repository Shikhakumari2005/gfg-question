// import java.util.HashSet;
// class Solution {
//     public boolean twoSum(int[] nums, int target) {
//         HashSet<Integer> arr=new HashSet<>();  //create a set
//         for(int i=0; i<nums.length;i++){
//             int complement =target-nums[i];
//             if(set.contain(complement)){
//                 return true;
//             }
//             set.add(nums[i]);
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;

//         boolean result = sol.twoSum(nums, target);
//         System.out.println("Two sum exists: " + result);
//     }
// }


import java.util.HashSet;

class twoSum{
    public boolean twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();  // create a set

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (set.contains(complement)) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
         twoSum sol = new twoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        boolean result = sol.twoSum(nums, target);
        System.out.println("Two sum exists: " + result);
    }
}
