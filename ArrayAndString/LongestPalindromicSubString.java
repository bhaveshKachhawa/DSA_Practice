class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        int first = 0;
        int second = first + 1;
        StringBuilder longestPalString = new StringBuilder();
        StringBuilder currentStr = new StringBuilder();
        char ch;
        longestPalString.append(s.charAt(0));
        currentStr.append(s.charAt(first));
        while(first<s.length()-1)
        {
           System.out.println(currentStr);
            ch = s.charAt(second);
            currentStr.append(ch);
            if(currentStr.toString().equals(currentStr.reverse().toString()))
            {
                System.out.print("hii");
                if(longestPalString.length()<currentStr.length())
                {
                    longestPalString.delete(0, currentStr.length());
                    longestPalString.append(currentStr);
                }
            }
            currentStr.reverse();
            ++second;
            
                       if(second == s.length())
                {
                    ++first;
                second = first+1;
                currentStr.delete(0, currentStr.length());
                currentStr.append(s.charAt(first));
                }
        }
        return longestPalString.toString();
    }
}