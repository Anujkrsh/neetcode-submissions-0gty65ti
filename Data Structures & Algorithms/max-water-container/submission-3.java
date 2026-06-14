class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int rt=heights.length-1;
        int max=0;
        while(l<rt){
            int len= rt-l;
            int br=Math.min(heights[l],heights[rt]);

            int are =len* br;
            max= Math.max(max,are);

            if(heights[l]>heights[rt]){
                rt--;
            }else{
                l++;
            }
        }
        return max;
    }
}
