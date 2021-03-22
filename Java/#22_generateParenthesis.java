class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<String>();
        gp(res,0,0,n,"");
        return res;
    }
    public void gp(List<String> res, int open,int close, int n, String s){
        if(s.length()==n*2){
            res.add(s);
            return;
        }
        if(open<n){
            gp(res,open+1,close,n,s+"(");
        }if(close<open){
            gp(res,open,close+1,n,s+")");
        }
    }
}
