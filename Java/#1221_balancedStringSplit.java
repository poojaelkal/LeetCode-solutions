class Solution {
    public int balancedStringSplit(String s) {
        int ref=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                ref+=1;
            }else{
                ref-=1;
            }
            if(ref==0){
                count+=1;
            }
        }
        return count;
    }
}
