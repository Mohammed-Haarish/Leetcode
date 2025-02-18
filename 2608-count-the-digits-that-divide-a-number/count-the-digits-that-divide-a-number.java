class Solution {
    public int countDigits(int num) {
        int c=0,s;
        int emp=num;
        
            while(emp>0)
            {
                s=emp%10;
                
            if(num%s==0)
            {
                c++;
            }
            emp=emp/10;
            }
        
        return c;
    }
}