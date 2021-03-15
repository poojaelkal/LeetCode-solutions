class Solution {
    public String reorganizeString(String S) {
        int[] count = new int[26];
        for(int i=0;i<S.length();i++){
            count[S.charAt(i)-'a']++;
        }
        char check=' ';
        int max=0, letter = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                letter = i;
            }
        }
        if(max>(S.length()+1)/2) return "";
        char[] res = new char[S.length()];
        int inc=0;
        while(count[letter]>0){
            res[inc]=(char)(letter+'a');
            inc+=2;
            count[letter]--;
                
        }
         for(int i=0;i<26;i++){
             while(count[i]>0){
                 if(inc>=S.length()){
                     inc=1;
                 }
                 res[inc]=(char)(i+'a');
                inc+=2;
                count[i]--;
             }   
            }
        
        return new String(res);
    }
}
