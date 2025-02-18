class Solution {
    public int maxDepth(String s) {
    int c=0,a=0;
        for(char ch:s.toCharArray()){
            
            if(ch=='(')
            {
                   c++;
 a=Math.max(c,a);
            }
           
            else if(ch==')')
            {

                c--;
            }

        }
       return a; 
    }
}