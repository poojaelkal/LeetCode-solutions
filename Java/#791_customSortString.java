class Solution {
    public String customSortString(String s, String t) {
       
        int[] count = new int[26];
        for(int i=0;i<t.length();i++){
            count[t.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            while(count[s.charAt(i)-'a']>0){
                sb.append(s.charAt(i));
                count[s.charAt(i)-'a']--;
            }
        }
        for(int i=0;i<26;i++){
            while(count[i]>0){
                sb.append((char)(i+'a'));
                count[i]--;
            }
        }
        return new String(sb);
    }
}
