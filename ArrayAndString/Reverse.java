class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        char temp;
        int count = s.length;
        count/=2;
        while(left<count){
            temp= s[left];
            s[left] = s[right];
            s[right] = temp;
            left+=1;
            right-=1;
        }
    }
}