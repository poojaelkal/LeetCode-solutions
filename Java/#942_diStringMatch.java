class Solution {
    public int[] diStringMatch(String S) {
        int i=0;
        int d=S.length();
        int[] res = new int[S.length()+1];
        for(int j=0;j<S.length();j++){
            if(S.charAt(j)=='I'){
                res[j]=i;
                i++;
            }else{
                res[j]=d;
                d--;
            }
        }
        res[S.length()]=i;
        return res;
    }
}
