class Solution {
    public List<String> removeComments(String[] source) {
        boolean star=false;
        List<String> ans=new ArrayList<String>();
        StringBuilder sb=new StringBuilder();
        for(String s:source){
           
            for(int i=0;i<s.length();i++){
                 if(star){
                if(i+1<s.length() && s.charAt(i)=='*' && s.charAt(i+1)=='/'){
                    i++;
                    star=false;
            }
                 }
            else{
                if(i+1<s.length() && s.charAt(i)=='/' && s.charAt(i+1)=='*'){
                    star=true;
                    i++;
                }else if(i+1<s.length() && s.charAt(i)=='/' && s.charAt(i+1)=='/') {
                    break;
                }
                // else if(i+1<s.length() && s.charAt(i)=='*' && s.charAt(i+1)=='/'){
                //     i++;
                //     star=false;
                else
                       sb.append(s.charAt(i));
                    
                }
            }
            
            if(!star && sb.length()!=0){
            ans.add(new String(sb));
                sb=new StringBuilder();
            }
        }
        return ans;
    }
}
