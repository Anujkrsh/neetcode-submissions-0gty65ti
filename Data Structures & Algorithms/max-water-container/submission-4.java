class Solution {
    public int maxArea(int[] heights) {
        int resp=0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            int len= Math.min(heights[i],heights[j]);
            int br= j-i;

            int area =len*br;
            resp= Math.max(area,resp);

            if(heights[j]>heights[i]){
                i++;
            }else{
                j--;
            }
        }
        return resp;
    }
}
