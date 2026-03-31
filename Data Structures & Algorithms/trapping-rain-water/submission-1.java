class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1;
        int l=height[i],r=height[j];
        int water=0;
        while(i<j){
            l= Math.max(height[i],l);
            r=Math.max(height[j],r);
            if(l<r){
                water+=l-height[i++];
            }else{
                water+=r-height[j--];
            }
        }
        return water;

    }
}
