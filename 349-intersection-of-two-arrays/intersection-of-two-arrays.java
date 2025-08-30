class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s=new HashSet<>();
        for(Integer i :nums1){
            s.add(i);
        }
        HashSet<Integer> res=new HashSet<>();{
            for(Integer i:nums2){
                if(s.contains(i)){
                    res.add(i);
                   // s.remove(i);
                }
            }
            //int b=res.length;
            int[] a=new int[res.size()];
            int i=0;
            for(Integer num:res){
                a[i++]=num;
            }
            return a;
        }
    }
}