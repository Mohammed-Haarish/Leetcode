class Solution {
   public List<String> summaryRanges(int[] nums) {
    int length = nums.length;
    List<String> result = new ArrayList<String>(length);
    for (int i = 0; i < length; i++) {
        int start = nums[i];
        while (i < length - 1 && nums[i] + 1 == nums[i + 1]) {
            i++;
        }
        if (start != nums[i]) {
            result.add(start + "->" + nums[i]);
        } else {
            result.add(start + "");
        }
    }
    return result;
}
}