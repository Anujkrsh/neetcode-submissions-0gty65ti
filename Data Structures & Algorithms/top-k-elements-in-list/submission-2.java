class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] num =new int[k]; 
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int i =0;i<bucket.length;i++){
            bucket[i]= new ArrayList<>();
        }

        for(int n: map.keySet()){
            int ind= map.get(n);
            bucket[ind].add(n);
        }

        int[] result= new int[k];
        int count=0;

        for(int j=bucket.length-1;j>=0 && count<k;j--){
            for(int a: bucket[j]){
                result[count++]=a;
            }
            if(count==k) break;
        }
        return result;
    }
}
