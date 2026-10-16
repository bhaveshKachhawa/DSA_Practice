import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        boolean res = false;
        if(s.length() == t.length()){
        char[] ch1= s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        s = new String(ch1);
        t = new String(ch2);
        if(s.equals(t))
        {
            res = true;
        }}
        return res;
    }
}