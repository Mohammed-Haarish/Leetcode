class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];
        
       
        int prev = -1;

        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
                result[i] = 0;  
            } else if (prev != -1) {
                result[i] = i - prev;  
            } else {
                result[i] = Integer.MAX_VALUE; 
            }
        }

     
        prev = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
                result[i] = 0;  
            } else if (prev != -1) {
                result[i] = Math.min(result[i], prev - i);  
            }
        }

        return result;
    }
}
