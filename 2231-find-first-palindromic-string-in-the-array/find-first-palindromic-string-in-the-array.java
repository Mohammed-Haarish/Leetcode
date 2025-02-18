class Solution {
    public String firstPalindrome(String[] words) {
       
        for(int i=0;i<words.length;i++)
        {
             StringBuilder st=new StringBuilder();
            st.append(words[i]);
            st.reverse();
            if(st.toString().equals(words[i]))
            {
                return words[i];
            }

        }
        return "";
    }
}