class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s: strs){
            sb.append(s.length()).append("~").append(s);
        }
        System.out.println(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int pnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '~'){
                int len=Integer.parseInt(str.substring(pnt,i));
                String word=str.substring(i+1,i+len+1);
                strs.add(word);
                pnt=i+len+1;
            }
            
        }
        return strs;
    }
}
