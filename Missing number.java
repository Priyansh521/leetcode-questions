class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> news = new HashSet<Integer>();
        for(int value: nums){
            news.add(value);
        }
        for(int i = 0; i<=nums.length;i++){
            if(!news.contains(i)){
                return i;
            }
        }
        return 0;
    }
}
