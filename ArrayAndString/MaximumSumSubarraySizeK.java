import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            
            set.add(nums[right]);
            currentSum += nums[right];
            
            if (set.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
                
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
        }
        
        return maxSum;
    }
}