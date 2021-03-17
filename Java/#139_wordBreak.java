class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s==null || s.length()==0) return false;
        boolean[] dp = new boolean[s.length()+1];
        Set<String> set = new HashSet<String>();
        for(String st:wordDict){
            set.add(st);
        }
        for(int i=1;i<=s.length();i++){
            String sub = s.substring(0,i);
            if(set.contains(sub)){
                dp[i]=true;
                
            }else{
                for(int j=i-1;j>=0;j--){
                    if(dp[j]&&set.contains(s.substring(j,i))){
                        dp[i]=true;
                    }
                }
            }
        }
        return dp[s.length()];
    }
}
