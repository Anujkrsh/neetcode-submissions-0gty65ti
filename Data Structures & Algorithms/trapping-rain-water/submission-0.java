class Solution {
    public int trap(int[] height) {
        int i=0;
        int j= height.length-1;
        int lmax=height[i];
        int rmax=height[j];
        int water=0;
        while(i<j){
            lmax=Math.max(lmax,height[i]);
            rmax=Math.max(rmax,height[j]);
            if(lmax<rmax){
                water+=lmax-height[i++];
            }
            else{
                water+=rmax-height[j--];
            }
        }
        return water;
    }
}
