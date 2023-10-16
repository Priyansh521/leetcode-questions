class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int value: nums){
            set.add(value);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i<= nums.length; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
