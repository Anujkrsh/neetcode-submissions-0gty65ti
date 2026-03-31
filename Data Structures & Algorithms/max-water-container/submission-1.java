class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j= heights.length-1;
        int max=0;

        while(i<j){
            int l=j-i;
            int b= Math.min(heights[i],heights[j]);
            int area= l*b;

            max= Math.max(max,area);
            if(heights[i]>heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}
