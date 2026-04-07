class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int [] arr= new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int ele= stack.pop();
                arr[ele]=i-ele;
            }
            stack.push(i);
        }
        return arr;
    }
}
