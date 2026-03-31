class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        int[] num =new int[k]; 
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        map= map.entrySet().stream()
                .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (oldValue,newValue)-> oldValue,
                    LinkedHashMap::new
                ));
        int count =0;

        for(int c: map.keySet()){
            num[count++]=c;
            if(count==k) return num;
        }

        return num;
    }
}
