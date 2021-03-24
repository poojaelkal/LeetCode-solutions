class Solution {
    public String frequencySort(String s) {
        int[] count=new int[256];
        int level=0;
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
            level=Math.max(level,count[s.charAt(i)]);
        }
        StringBuilder[] builder = new StringBuilder[level+1];
        for (int i = 0; i < builder.length; i++) {
        builder[i] = new StringBuilder();
    }
        for(int i=0;i<256;i++){
            if(count[i]>0){
                builder[count[i]]=builder[count[i]].append(Character.toString((char)i));
            }
        }
        StringBuilder ans = new StringBuilder();
    for (int i = level; i > 0; i--) {

        char[] levelChars = builder[i].
                                       toString().toCharArray();

        for (int j = 0; j < levelChars.length; j++) {

            for (int k = 0; k < i; k++) {
                ans.append(levelChars[j]);
            }

        }

    }
        return new String(ans);
        
    }
}
