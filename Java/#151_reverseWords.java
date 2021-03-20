class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()==1){
            return s;
        }
       StringBuffer res = new StringBuffer();
        for(int i=s.length()-1;i>-1;i--){
            if(s.charAt(i)==' ') continue;
            int end = i;
            while(i>-1 && s.charAt(i)!=' ')i--;
            res.append(s.substring(i+1, end+1)).append(" ");
        }
        return new String(res).trim();
}
}
