class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] alpha={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> s = new HashSet<String>();
        for(int i=0;i<words.length;i++){
            String trans="";
            for(int j=0;j<words[i].length();j++){
                int t = (int)words[i].charAt(j)-97;
                trans+=alpha[t];
            }
            s.add(trans);
        }
        return s.size();
    }
}
