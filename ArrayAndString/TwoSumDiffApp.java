import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean output = false;
        HashSet<Integer> store = new HashSet<>();
        for(int value : nums)
        {   
            if(store.contains(value)){
                output = true;
                break;
            }
            store.add(value);
        }
        return output;
    }
}