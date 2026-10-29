package hashing;
import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        for(int i = 0;i<strs.length;i++)
        {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(hash.containsKey(key)){
                hash.get(key).add(strs[i]);
            }
            else{
                hash.put(key, new ArrayList<>(List.of(strs[i])));
            }
        }
        return new ArrayList<>(hash.values());
    }
}
