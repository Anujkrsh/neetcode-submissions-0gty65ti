class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";

        int k = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;
        
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int req = need.size();
        int have = 0;

        for (int i = 0; i < s.length(); i++) {
            window.put(s.charAt(i), window.getOrDefault(s.charAt(i), 0) + 1);
            if (need.containsKey(s.charAt(i)) && window.get(s.charAt(i)) == need.get(s.charAt(i)))
                have++;

            while (req == have) {
                char c = s.charAt(k);
                if(i-k+1 < minLen){
                    minLen=i-k+1;
                    start=k;
                }
                window.put(c, window.get(c) - 1);

                if (need.containsKey(c) && window.get(c) < need.get(c)) {
                    have--;
                }
                k++;
            }
        }

        return minLen== Integer.MAX_VALUE ? "":s.substring(start,start+minLen);
    }
}
