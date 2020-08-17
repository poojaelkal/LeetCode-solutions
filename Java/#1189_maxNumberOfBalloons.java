class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count=new int[26];
        int[] bln=new int[26];
        for(int i=0;i<text.length();i++){
            count[text.charAt(i)-'a']++;
        }
        int min=text.length();
        for(char c:"balloon".toCharArray()){
            bln[c-'a']++;
        }
        for(char c:"balloon".toCharArray()){
            min=Math.min(min,count[c-'a']/bln[c-'a']);
        }
        return min;
    }
}
