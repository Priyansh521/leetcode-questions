class Solution {
    public boolean isPalindrome(String s) {
    // if the string is empty then it will return true
        if(s.isEmpty()){
            return true;
        }
        //we're using two pointers here start and last which will travel towards each other until they're at the same position
        int start = 0;
        int last = s.length() -1;
        while(start<=last){
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if(!Character.isLetterOrDigit(currFirst)){
                start++;
            }else if(!Character.isLetterOrDigit(currLast)){
                last--;
            }else{
                if(Character.toLowerCase(currFirst)!= Character.toLowerCase(currLast)){
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;

    }
}
