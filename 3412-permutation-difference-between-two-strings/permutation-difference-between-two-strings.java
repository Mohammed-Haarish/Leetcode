class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;

        for(int i=0; i<s.length(); i++){
            int n = Math.abs(i-t.indexOf(s.charAt(i)));
            ans = ans + n;
        } 

        return ans;
    }
}