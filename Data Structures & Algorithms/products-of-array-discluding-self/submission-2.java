class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length= nums.length;
        int[] suffix = new int[length];
        int[] prefix = new int[length];
        int[] res = new int[length];
        suffix[0]= 1;
        prefix[length-1]=1;
        for(int i=1;i<length;i++){
            suffix[i]=nums[i-1]*suffix[i-1];
        }
        for(int j=length-2;j>=0;j--){
            prefix[j]=nums[j+1]*prefix[j+1];
        }
        
        for(int i=0;i<length;i++){
            nums[i]=prefix[i]*suffix[i];
        }
        return nums;
    }
}  
