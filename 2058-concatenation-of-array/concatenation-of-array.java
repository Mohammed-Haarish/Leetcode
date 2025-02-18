class Solution {
    public int[] getConcatenation(int[] nums) {
      int[]arr=new int[nums.length*2];
      int i=0;
      for( i=0;i<nums.length;i++)
      {
        arr[i]=nums[i];
        arr[i+nums.length]=nums[i];
      } 
      return arr;
    }
}