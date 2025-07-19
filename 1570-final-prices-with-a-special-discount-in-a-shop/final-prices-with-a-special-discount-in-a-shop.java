class Solution {
    public int[] finalPrices(int[] prices) {
        int res[]=new int[prices.length];
        for(int i=0;i<prices.length;i++)
        { 
            int sum=prices[i];
            for(int j=i+1;j<prices.length;j++)
            {
               if(prices[i]>=prices[j])
               {
                sum=prices[i]-prices[j];
                break;
               }
               
            }
         res[i]=sum;

        }
        return res;
    }
}