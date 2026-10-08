class Solution {
    public int[] twoSum(int[] nums, int target)
     {
        int[] output = {0,1};
        if(nums.length != 2)
        {
            int first = 0;
            int second = first+1;
            while(first != nums.length-1)
            {

            if(nums[first]+nums[second] == target){
                     output[0] = first;
                output[1] = second;
                break; 
                }
            ++second;
            if(second == nums.length){
                ++first;
                second = first+1;
            }
        }}
         return output;
    }
}
