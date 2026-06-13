class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int i = 0;
        int last = clean.length() - 1;

        while (last > i) {
            if (clean.charAt(last) != clean.charAt(i)) {
                return false;
            }
            last--;
            i++;
        }
        return true;
    }
}
