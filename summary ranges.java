class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> sorted = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            int x = nums[i];
            while(i < nums.length - 1 && nums[i] + 1 == nums[i+1]) {
                i++;
            }
            if(x == nums[i]) {
                sorted.add("" + nums[i]);
            } else {
                sorted.add(x + "->" + nums[i]);
            }
        }
        return sorted;

    }
}
