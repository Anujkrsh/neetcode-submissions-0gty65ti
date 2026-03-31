class Solution {
    public boolean isAnagram(String s, String t) {
       char[] sa= s.toCharArray();
       char[] ta= t.toCharArray();

       Arrays.sort(sa);
       Arrays.sort(ta);

        String s2=new String(sa);
        String t2= new String (ta);

        if(s2.equals(t2)) return true;
        return false;
    }
}
