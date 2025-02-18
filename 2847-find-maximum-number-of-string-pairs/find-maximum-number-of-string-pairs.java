class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int c=0;
        for (int i=0;i<words.length;i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            for(int j=i+1;j<words.length;j++)
            {
            if (sb.toString().equals(words[j])) {
                c++;
            }
        }
        }
        return (c);
    }
}