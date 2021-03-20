class Solution {
    public String reverseWords(String s) {
        int start=0;
        char[]c = s.toCharArray();
        int i;
        for(i=0;i<s.length();i++){
            if(c[i]!=' ') continue;
            int end=i;
            while(start<end){
              char ch= c[start];
                c[start]=c[end-1];
                c[end-1]=ch;
                start++;
                end--;
            }
            start=i+1;   
        }
        
        while(start<i-1){
              char ch= c[start];
                c[start]=c[i-1];
                c[i-1]=ch;
                start++;
                i--;
            }
        
        return new String(c).trim();
    }
}
