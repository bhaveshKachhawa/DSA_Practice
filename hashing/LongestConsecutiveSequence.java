package hashing;
import java.util.HashSet;
class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int length = 0;
        HashSet<Integer> hash = new HashSet<>();
        for(int num:nums){
            hash.add(num);
        }
        for(int num:hash){
            if(!hash.contains(num-1)){
                int currentLength = 1;
                while(hash.contains(num+1)){
                    ++currentLength;
                    ++num;
                }
                length = Math.max(currentLength, length);
            }
        }
        return length;
    }
}
