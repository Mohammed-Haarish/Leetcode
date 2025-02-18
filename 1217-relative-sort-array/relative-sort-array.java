class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[]=new int[arr1.length];
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
               if(arr2[i]==arr1[j])
               {
                al.add(arr1[j]);
               }
            }      
        }
         for(int i=0;i<arr1.length;i++)
        {
            
                if(!al.contains(arr1[i]))
                {
                    al1.add(arr1[i]);
                }
            
        }
        Collections.sort(al1);
        int i=0,a=0;
        for( i=0;i<al.size();i++)
        {
            ans[i]=al.get(i);
        }
        for( int j=i;j<arr1.length;j++)
        {
          ans[j]=al1.get(a++);  
        }
        return ans;
    }
}