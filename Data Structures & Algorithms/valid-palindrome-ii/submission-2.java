class Solution {
    public boolean validPalindrome(String s) {

        int start=0;
        int end=s.length()-1;
        boolean skip=false;
    while(start < end){
    if(s.charAt(start) != s.charAt(end)){
        if(checkPalindrome(s,start+1,end)){
            return true;
        }else{
            return checkPalindrome(s,start,end-1);
        }
    }
    start++;
    end--;
}
return true;
    }

    public boolean checkPalindrome(String s, int start, int end){
        int a=start,b=end;
        while(a<b){
            if(s.charAt(a++)!=s.charAt(b--)){
                    return false;
            }
        }
        return true;
    }
}