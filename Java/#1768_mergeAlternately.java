class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        StringBuffer bf = new StringBuffer();
        while(i<word1.length()&&i<word2.length()){
            bf.append(word1.charAt(i));
            bf.append(word2.charAt(i));
            i++;
        }
        while(i<word1.length()){
            bf.append(word1.charAt(i));
            i++;
        }
        while(i<word2.length()){
            bf.append(word2.charAt(i));
            i++;
        }
        return new String(bf);
    }
}
