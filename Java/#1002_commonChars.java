class Solution {
    public List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<>();
        int[] count=getCount(A[0]);
        for(int i=1;i<A.length;i++){
            int[] temp = getCount(A[i]);
            for(int t=0;t<26;t++){
                if(temp[t]<count[t]){
                    count[t]=temp[t];
                }
            }
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<count[i];j++){
                res.add(Character.toString((char)(i+'a')));
            }
        }
        return res;
        
    }
    private int[] getCount(String s){
        int[] count=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        return count;
    }
}
