class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> h= new HashSet<>();
        int i=0;

        for(int j=0;j<nums.length;j++){
            if(!h.add(nums[j])){
                return true;
            }
            if(h.size()>k){
                h.remove(nums[i++]);
            }
        }
        return false;
    }
}