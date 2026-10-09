class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int[] answer = new int[nums.length];
        //left product
        int leftProduct = 1; 
        answer[0] = 1;   
        for(int i=0;i<nums.length;i++)
        {
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }
        // 1,0
        System.out.print(answer[1]);
        int rightProduct = 1;
        for(int i=nums.length-1;i>=0;i--)
        {
            answer[i] *=rightProduct;
            rightProduct*=nums[i];
        }
        return answer;
    }
    
}