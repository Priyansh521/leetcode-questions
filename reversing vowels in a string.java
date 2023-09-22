class Solution {
    public boolean isVowel(char i){
            return i=='a' || i=='e' || i=='i' || i=='o' || i=='u' || i=='A' || i=='E' || i=='I' || i=='O' || i=='U';
    }
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int i = 0;
        int j = s.length() -1;
        while(i<j){
            while(i<j &&!isVowel(s.charAt(i))) {
                    i++;
            }
            while(i<j && !isVowel(s.charAt(j))) {
                j--;
            }
            char temp = ans[i];
            ans[i++] =ans[j];
            ans[j--] = temp;
        }
        return new String(ans);
    }
}
