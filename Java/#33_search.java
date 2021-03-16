class Solution {
    public int search(int[] nums, int target) {
        int lo=0;
        int high=nums.length-1;
        while(lo<high){
            int mid = (lo+high)/2;
            if(target==nums[mid]) return mid;
            if(nums[lo]<=nums[mid]){
                if(target>=nums[lo]&&target<nums[mid]){
                    high=mid-1;
                }else{
                    lo=mid+1;
                }
            }else{
                if(target>nums[mid]&&target<=nums[high]){
                    lo=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return nums[lo]==target?lo:-1;
    }
}
