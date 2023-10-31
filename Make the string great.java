lass Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new  Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(stack.size()>0 && stack.peek()!=s.charAt(i)){
                String s1 = ""+stack.peek();
                String s2 = ""+s.charAt(i);
                if(s1.toLowerCase().equals(s2.toLowerCase())){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
