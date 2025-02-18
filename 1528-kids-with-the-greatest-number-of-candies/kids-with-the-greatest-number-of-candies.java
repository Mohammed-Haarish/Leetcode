class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> al=new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i=0;i<candies.length;i++)
        {
             if(candies[i]+extraCandies>=max)
             {
                al.add(true);
             }
             else
             {
                al.add(false);
             }
        }
        return al;
    }
}