class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(String s: logs){
            if(s.equals("../")){
                if(count!= 0) count--;
            }else if(!s.equals("../") && !s.equals("./")){
                count++;
            }else if(s.equals("./")){
                continue;
            }
        }
       return count;
    }
}
