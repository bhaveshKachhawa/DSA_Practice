package Recursion;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTrack(list,"",0,0,n);
        return list;
    }
    void backTrack(List<String> result, String current, int open, int close, int max){
        if(current.length() == max*2){
            result.add(current);
            return;
        }
        if(open<max){
            backTrack(result, current+"(", open+1, close, max);
        }
        if(close<open){
            backTrack(result, current+")", open, close+1, max);
        }
    }   
}
