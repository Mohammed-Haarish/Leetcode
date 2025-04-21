class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder letters = new StringBuilder();

        // Collect all letters
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                letters.append(s.charAt(i));
            }
        }

        // Reverse the collected letters
        letters.reverse();
        StringBuilder ans = new StringBuilder();
        int j = 0;

        // Build final string with reversed letters in original positions
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                ans.append(letters.charAt(j));
                j++;
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}
