class Solution {
    public String reverseStr(String s1, int k) {
        // Convert the string into an array of characters
        String[] s = s1.split("");
        String tt = "";
        
        // Process in blocks of 2*k length
        for (int i = 0; i < s.length; i += 2 * k) {
            // Reverse the first k characters in each block
            int left = i;
            int right = Math.min(i + k - 1, s.length - 1);  // Make sure right doesn't go out of bounds
            
            while (left < right) {
                // Swap characters
                String temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }

        // Rebuild the string by concatenating all elements
        for (int i = 0; i < s.length; i++) {
            tt = tt + s[i];
        }
        
        return tt;
    }
}
