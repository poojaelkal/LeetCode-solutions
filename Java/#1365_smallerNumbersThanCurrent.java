class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buck = new int[101];
        for(int i=0;i<nums.length;i++){
            buck[nums[i]]++;
        }
        
        for(int i=1;i<101;i++){
            buck[i] += buck[i-1];
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            nums[i] = buck[nums[i]-1];
        }
           
        }
        return nums;
    }
    }
