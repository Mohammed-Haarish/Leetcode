class Solution {
    public int pivotInteger(int n) {
       
        int totalSum = (n * (n + 1)) / 2;

       
        int sum1 = 0;
        
        
        for (int x = 1; x <= n; x++) {
            sum1 += x;  
            
        
            int sum2 = totalSum - sum1 + x;
            
            if (sum1 == sum2) {
                return x;  
            }
        }

        
        return -1;
    }
}
