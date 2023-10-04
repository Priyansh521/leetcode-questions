import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> setA = new HashSet<>();
       Set<Integer> intersect = new HashSet<>();
       for(int num: nums1){
           setA.add(num);
       }
       for(int num : nums2){
           if(setA.contains(num)){
               intersect.add(num);
           }
       }
       int[] result = new int[intersect.size()];
       int i = 0;
       for(int num: intersect){
           result[i++] = num;
       }
       return result;
    }
}
