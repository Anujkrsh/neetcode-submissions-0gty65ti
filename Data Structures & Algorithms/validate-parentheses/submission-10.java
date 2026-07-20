class Solution {
    public boolean isValid(String s) {
        if(s.length()<2) return false;
        Deque<Character> st = new ArrayDeque<>();

        for(char c: s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                st.push(c);
                
            }else{
                if (st.isEmpty()) return false;
                if(c=='}' && st.peek()=='{' ){
                    st.pop();
                    continue;
                } else if (c==']' && st.peek()=='[' ){
                    st.pop();
                    continue;
                } else if (c==')' && st.peek()=='(' ){
                    st.pop();
                    continue;
                }else{
                return false;
                }
            }
        }

        return st.isEmpty();
    }
}
