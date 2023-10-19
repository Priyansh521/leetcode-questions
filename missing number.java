class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> list = new HashSet<>();
        int a = 0;
        for(int num: nums){
            list.add(num);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
