class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int start=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        int end=k;
        while(end<nums.length){
            sum-=nums[start++];
            sum+=nums[end];
            max=Math.max(max,sum);
            end++;
        }
        return (double)max/(double)k;
    }
}
