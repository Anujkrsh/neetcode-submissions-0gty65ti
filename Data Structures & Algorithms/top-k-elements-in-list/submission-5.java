class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        
        for(int key : map.keySet()){
            int freq=map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        List<Integer> fin= new ArrayList<>();

        for(int i = bucket.length-1; i>0 && fin.size() < k; i--){
           if(bucket[i]!=null){
                fin.addAll(bucket[i]);
           }
        } 

        return fin.stream().mapToInt( i -> i).toArray();
    }
}
