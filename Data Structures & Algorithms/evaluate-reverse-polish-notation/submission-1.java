class Solution {
    public int evalRPN(String[] tokens) {
       Deque<Integer> stack= new ArrayDeque<>();
       for(String c : tokens){
        if(c.equals("+") ||c.equals("-")||c.equals("*") || c.equals("/")){
            Integer x= stack.pop();
            Integer y= stack.pop();
            if(c.equals("+")){
                int z= x+y;
                stack.push(z);
            }else if(c.equals("-")){ 
                    Integer fin=y-x;
                    stack.push(fin);
                }else if(c.equals("*")){ 
                    Integer fin=y*x;
                    stack.push(fin);
                }else if(c.equals("/")){ 
                    Integer fin=y/x;
                    stack.push(fin);
                }
       }else{
        stack.push(Integer.parseInt(c));
       }
       }
       return stack.pop();
    }
}
