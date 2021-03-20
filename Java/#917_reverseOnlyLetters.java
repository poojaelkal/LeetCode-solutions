class Solution {
    public String reverseOnlyLetters(String S) {
        char[] c = S.toCharArray();
        int i=0;
        int j=c.length-1;
        
        while(i<j){
            while(i<j && !Character.isLetter(c[i])) i++;
            while(j>i && !Character.isLetter(c[j])) j--;
            char t = c[i];
            c[i]=c[j];
            c[j]=t;
            i++;
            j--;
        }
        return new String(c);
    }
}
