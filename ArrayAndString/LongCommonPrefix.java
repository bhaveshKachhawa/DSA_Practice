class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();
        int count  = 0;
        for(int i=1;i<strs.length;i++)
        {
            if(minLength > strs[i].length())
            {
                minLength = strs[i].length();
            }
        }
        char ch;
        StringBuilder obj = new StringBuilder();
        while(count < minLength)
        {
            ch = strs[0].charAt(count);
           for(int i=1;i<strs.length;i++)
            {
                    if(ch != strs[i].charAt(count))
                  {
                        return obj.toString();
                    }
          }
         obj.append(ch);       
         ++count;     
        }
        return obj.toString();
    }
}