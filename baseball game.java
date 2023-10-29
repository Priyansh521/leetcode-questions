class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> c = new Stack<>();
        for(String op: operations){
            if(op.equals("C")){
                if(!c.isEmpty()){
                    c.pop();
                }
            }else if(op.equals("D")){
                 if(!c.isEmpty()){
                    c.push( c.peek()*2 );
                }
                
            }else if( op.equals("+")){
                if(c.size()>=2){
                    int top =c.pop();
                    int newTop = c.peek() + top;
                    c.push(top);
                    c.push(newTop);
                }
            }else{
                c.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while(!c.isEmpty()){
            sum += c.pop();
        }
        return sum;
    }
}
