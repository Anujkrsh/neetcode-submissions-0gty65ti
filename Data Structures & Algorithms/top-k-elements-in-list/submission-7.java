class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();

        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        List<Integer>[] bucket= new ArrayList[nums.length+1];

        for(int n: map.keySet()){

            int freq=map.get(n);

            if(bucket[freq]==null){
                bucket[freq]= new ArrayList<>();
            }
            bucket[freq].add(n);
        }

        int[] res= new int[k];
        int ind=0;
        for(int i=bucket.length-1;i>0 && ind<k;i--){
            if(bucket[i] == null) continue;
            for(int n: bucket[i]){
                res[ind++]=n;
            }
        }
        return res;
    }
}
