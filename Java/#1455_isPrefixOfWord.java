class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] res=sentence.split(" ");
        for(int i=1;i<=res.length;i++){
            if(res[i-1].startsWith(searchWord)){
                return i;
            }
        }
       return -1;
    }
}
