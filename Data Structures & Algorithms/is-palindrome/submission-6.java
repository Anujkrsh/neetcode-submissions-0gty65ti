class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int last = s.length() - 1;

        while (last > i) {
            while(i < last && !Character.isLetterOrDigit(s.charAt(last) )){
                last--;
            }
            while(i < last && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            if (Character.toLowerCase(s.charAt(last)) != Character.toLowerCase(s.charAt(i)) ) {
                return false;
            }
            last--;
            i++;
        }
        return true;
    }
}
