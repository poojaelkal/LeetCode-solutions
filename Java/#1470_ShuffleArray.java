class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int[] res = new int[nums.length];
        while(i<n && j<nums.length){
            res[2*i] = nums[i];
            res[2*i+1] = nums[j];
            i++;
            j++;
            
        }
        return res;
        
    }
}
