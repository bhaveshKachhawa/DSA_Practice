package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        generateSubSets(0, nums, new ArrayList<>(), result);
        return result;
    }
    private void generateSubSets(int index, int[] nums, List<Integer> current, List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        generateSubSets(index+1, nums, current, result);
        current.add(nums[index]);
        generateSubSets(index+1, nums, current, result);
        current.remove(current.size()-1);
    }
}
