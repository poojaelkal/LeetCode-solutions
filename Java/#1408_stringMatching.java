class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=i+1;j<words.length;j++){
                String w=words[j];
                if(s.contains(w) && !res.contains(w)){
                    res.add(w);
                }
                if(w.contains(s) && !res.contains(s)){
                    res.add(s);
                }
            }
        }
        return res;
    }
}
