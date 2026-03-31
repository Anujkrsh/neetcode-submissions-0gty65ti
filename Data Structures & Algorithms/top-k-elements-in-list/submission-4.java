class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,Integer> map = new HashMap<>();

         for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
         }

        List<Integer>[] list= new ArrayList[nums.length+1];
        for(int n=0;n<list.length;n++){
                list[n]= new ArrayList<>();
        }

        for(int j:map.keySet()){
            int ind= map.get(j);
            list[ind].add(j);
        }

        int[] result = new int[k];
        int count=0;
        for(int i= list.length-1;i>=0;i--){
            for(int n: list[i]){
                result[count++]=n;
            }
            if(count==k) break;
        }
        return result;
    }
}
