class Solution {
    public int maxProduct(int[] nums) {
        int prod=nums[0];
        int max=nums[0];
        int l=0,r=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            l=(l==0?1:l)*nums[i];
            r=(r==0?1:r)*nums[n-1-i];
            max=Math.max(max,Math.max(l,r));
        }
        return max;
    }
}
