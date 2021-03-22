class Solution {
    public int compress(char[] chars) {
        if(chars.length<=0) return 0;
        if(chars.length==1) return 1;
        int j=0;
        StringBuffer sb = new StringBuffer();
        int count=1;
        int i;
        for(i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                
                count++;
            }else{
                if(count==1){
                    chars[j++]=chars[i-1];
                    
                }else{
                    chars[j++]=chars[i-1];
                
                   String strFreq = String.valueOf(count); 
                for (char chFreq : strFreq.toCharArray()){
                    chars[j++] = chFreq;
                }
                    count=1;
                }
            }
        }
        if(count==1){
                    chars[j++]=chars[i-1];
                    
                }else{
                    chars[j++]=chars[i-1];
               String strFreq = String.valueOf(count); 
                for (char chFreq : strFreq.toCharArray()){
                    chars[j++] = chFreq;
                }
                    
                }
        
        return j;
        
    }
}
