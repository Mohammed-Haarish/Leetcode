class Solution {
    public String winningPlayer(int x, int y) {
        int c = 0;
        
        
        while (x >= 1 &&y>=4) {
            x = x - 1;  
            y = y - 4;   
            c++;          
        }

        
        return (c % 2 == 0) ? "Bob" : "Alice";
    }
}
