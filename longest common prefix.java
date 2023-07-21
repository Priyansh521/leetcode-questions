class Solution {
    
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
            int n = strs.length;
            String s1 = strs[0];
            String s2 = strs[n-1];
            int idx = 0;
            String lcp = "";
            while(idx < s1.length() && idx< s2.length()){
                if(s1.charAt(idx) == s2.charAt(idx)){
                    lcp += s1.charAt(idx);
                    idx++;
                }else break;
            }
            return lcp;
    }
}
