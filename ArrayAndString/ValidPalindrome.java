class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s.toUpperCase());
        String reverseStr = "";
        boolean isPalindrome = false;
      
        for(int i = str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            if((ch >= 65 && ch <= 90) || (ch >= 48 && ch<=57))
            {
                  reverseStr+=ch;
            }
            else
            {
                str.deleteCharAt(i);
            }
        }
          
        s = str.toString();
        // System.out.println(s);
        if(s.equals(reverseStr))
        {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}