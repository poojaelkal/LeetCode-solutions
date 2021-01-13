class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=words.length;
        for(String word:words){
             for(int i=0;i<word.length();i++){
                 if(!allowed.contains(Character.toString(word.charAt(i)))){
                     count--;
                     break;
                 }
             }   
        }
        return count;
        
    }
}
