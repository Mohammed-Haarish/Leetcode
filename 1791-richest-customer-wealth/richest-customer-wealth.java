class Solution {
    public int maximumWealth(int[][] a) {

        int sum=0;
        int max=0;
    
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
                   {
                    sum=sum+a[i][j];
                  }  
                  max=Math.max(sum,max);
                  sum=0;     
        }
        return max;
        
    }
}