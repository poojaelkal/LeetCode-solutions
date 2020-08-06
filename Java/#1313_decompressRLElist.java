class Solution {
    public int[] decompressRLElist(int[] nums) {
       int arraySize = 0;
        for(int i=0;i<nums.length;i+=2){
            arraySize+=nums[i];
        }
        int[] list = new int[arraySize];
        
        int start=0;
        for(int i=0;i<nums.length;i+=2){
            Arrays.fill(list,start,start+nums[i],nums[i+1]);
            start+=nums[i];
        }
        return list;
        
    }
}
