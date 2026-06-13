class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] ch1= s.toCharArray();
            Arrays.sort(ch1);

            String key = Arrays.toString(ch1);
            map.computeIfAbsent(key,k -> new ArrayList<>())
                .add(s);

        }
        return new ArrayList<>(map.values());
    }
}
