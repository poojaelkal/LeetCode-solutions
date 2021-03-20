class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int i=0;
        int n=s.length();
        if(s==null || s.length()==1){
            return s;
        }
        if(k>s.length()) {
            int j=s.length()-1;
            reverse(c,i,j);
        }
        else{
        while(i<s.length()){
            int start=i;
             int end = Math.min(i + k - 1, n - 1);
            reverse(c,start,end);
            i+=(2*k);
        }
        }
        return new String(c);
    }
    
    public void reverse(char[] c, int start, int end){
        if(end<=c.length){
        while(start<end){
                char ch= c[start];
                c[start]=c[end];
                 c[end]=ch;
                start++;
                end--;
            }
        }
    }
}
