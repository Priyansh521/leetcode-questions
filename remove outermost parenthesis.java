class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(stack.size()>0){
                    str.append(s.charAt(i));
                }
                stack.push(s.charAt(i));
            }else{
                stack.pop();
                if(stack.size()>0){
                    str.append(s.charAt(i));
                }
            }
        }
        return str.toString();
    }
}
