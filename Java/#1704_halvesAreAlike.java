class Solution {
    public boolean halvesAreAlike(String s) {
        int s1_count=0;
        int s2_count=0;
        for(int i=0;i<s.length()/2;i++){
            if(isVowel(s.charAt(i))){
                s1_count++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                s2_count++;
            }
        }
        return s1_count==s2_count;
        
    }
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
