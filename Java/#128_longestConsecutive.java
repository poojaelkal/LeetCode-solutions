class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> s = new HashSet<Integer>();
        for(int n:nums){ s.add(n);}
        int max=0;
        
        for(int n:nums){
            if(s.remove(n)){
                int lower=n;
                int upper=n;
                int count=1;
                while(s.remove(lower-1)){
                    count++;
                    lower = lower-1;
                }
                while(s.remove(upper+1))
                {count++;
                 upper = upper+1;
                 }
                max = Math.max(max,count);
            }
        }
        return max;
        
    }
}
