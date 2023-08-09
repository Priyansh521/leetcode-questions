class Solution {
    public int lengthOfLongestSubstring(String s) {
        // To store unique characters in the current window
        Set<Character> charSet = new HashSet<>(); 
        // To store the maximum length of the substring
        int maxLength = 0; 
        // Left pointer of the sliding window
        int left = 0; 

        for (int right = 0; right < s.length(); right++) {
            //if the set contains the character then it will shift the left pointer
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
