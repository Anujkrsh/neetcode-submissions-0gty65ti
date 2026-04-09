class Solution {

    public String encode(List<String> strs) {
        StringBuilder fin=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            fin.append(strs.get(i).length()).append(">").append(strs.get(i));
        }

        return fin.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i=0;
        while(i<str.length()){ 
            int j = i;
            while (str.charAt(j) != '>') {
            j++;
            }

            // 2. parse length
            int len = Integer.parseInt(str.substring(i, j));
            String sub= str.substring(j+1,j+1+len);
            strs.add(sub);
            i=j+len+1;
        }

        return strs;
    }
}
