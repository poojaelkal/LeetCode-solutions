class Solution {
    public String toGoatLatin(String S) {
        String[] res=S.split(" ");
        String result="";
        for(int i=0;i<res.length;i++){
            char t=res[i].charAt(0);
            if(t=='A' || t=='E' || t=='I' || t=='O' || t=='U' ||
              t=='a' || t=='e' || t=='i' || t=='o' || t=='u'){
                res[i]=res[i]+"ma";
                int k=i+1;
                while(k>0){
                    res[i]=res[i]+"a";
                    k--;
                }
            }
            else{
                String tmp=res[i].substring(1);
                res[i]=tmp+t+"ma";
                int k=i+1;
                while(k>0){
                    res[i]=res[i]+"a";
                    k--;
                }
            }
        }
        for(String s:res){
            result+=" "+s;
        }
        String r=result.trim();
        return r;
    }
}
