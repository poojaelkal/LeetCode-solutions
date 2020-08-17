class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] counts = getCounts(chars);
        int res=0;
        for(String s:words){
            int[] wordcounts=getCounts(s);
            boolean flag=true;
            for(int i=0;i<26;i++){
                if(wordcounts[i]>counts[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                res=res+s.length();
            }
        }
        return res;
        
        
    }
    private int[] getCounts(String s){
        int[] counts=new int[26];
        for(char c:s.toCharArray()){
            counts[c-'a']++;
        }
        return counts;
    }
}
