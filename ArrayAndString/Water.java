class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);

            int currentArea = width * h;
            maxWater = Math.max(maxWater, currentArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}
// Two Pointers: Can move anywhere (inward, outward, or same direction) to find a target.

// Sliding Window: Always moves strictly forward in a continuous block to track subarrays/substrings.