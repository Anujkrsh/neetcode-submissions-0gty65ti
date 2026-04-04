class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack= new ArrayDeque<>(); 
        for(String c : tokens){
            if(c.equals("+") ||c.equals("-")||c.equals("*") || c.equals("/")){
                int x= stack.pop();
                int y= stack.pop();
                if(c.equals("+")){ 
                    Integer fin=x+y;
                    stack.push(fin);
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
                continue;
            }
            stack.push(Integer.parseInt(c));
        }
        return stack.pop();

    }
}
