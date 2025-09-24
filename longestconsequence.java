import java.util.Arrays;

public class longestconsequence {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxCount = 1;
        int count =1;
        if(nums.length==0){
            return 0;
        }
        for(int i=1; i<nums.length; i++){
            // Skip duplicates
            if (nums[i] == nums[i - 1]) continue;
            if(nums[i]-nums[i-1]==1){
                count++;
            }
            else {
                count = 1; // Reset count if not consecutive
            }
            maxCount = Math.max(maxCount, count);
            
        }
        return maxCount;
    }
    public static void main(String[] args){
        int nums[]={5,8,9,10,1003,3,2,1};
       // int res=longestConsecutive(nums);
        System.out.println(longestConsecutive(nums));
    }
}

