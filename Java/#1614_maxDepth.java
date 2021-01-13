class Solution {
    public int maxDepth(String s) {
        int maxDepth=0;
        int paren=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                paren+=1;
                maxDepth=Math.max(maxDepth,paren);
            }if(s.charAt(i)==')'){
                paren-=1;
            }
        }
        return maxDepth;
    }
}
