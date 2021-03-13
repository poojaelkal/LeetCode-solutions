class Solution {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        int[] c = new int[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
        }
        while(sb.length()<s.length()){
        for(int i=0;i<26;i++){
            if(c[i]!=0){
                sb.append((char)(i+'a'));
                c[i]--;
            }
        }
        for(int i=25;i>-1;i--){
            if(c[i]!=0){
                sb.append((char)(i+'a'));
                c[i]--;
            }
        }
        }
        return new String(sb);
    }
}
