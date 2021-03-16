class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        Set<Character> set = new HashSet<Character>();
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
               set.remove(s.charAt(i));
                i++;
            }else{
                set.add(s.charAt(j));
                j++;
                max = Math.max(max,set.size());
            }
        }
        return max;
            
        
    }
}
