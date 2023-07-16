class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = m-1;
       int j = n-1;
       int k = m+n-1;
       while(i>=0 && j>=0){
           //we're starting from the end '
             if(nums1[i]>nums2[j]){
                 nums1[k] = nums1[i];
                 k--;
                 i--;
             }else{
                 nums1[k]= nums2[j];
                 k--;
                 j--;
             }
       }
       //if still any element remain in the nums2 array 
       while(j>=0){
           nums1[k] = nums2[j];
           k--;
           j--;
       }
    }
}
