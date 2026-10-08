class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        boolean output = false;
        int first = 0;
        int second = first+1;
        while(first != nums.length-1){
            if(nums[first] == nums[second])
            {
                output = true;
                break;
            }
            ++second;
            if(second == nums.length)
            {
                ++first;
                second = first+1;
            }
        }
        return output;
    }
}