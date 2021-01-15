class Solution {
    public String toLowerCase(String str) {
       String result="";
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=65&&(int)str.charAt(i)<=65+26){
                int t=(int)str.charAt(i)+32;
                result+=Character.toString((char)t);
            }else{
                result+=Character.toString(str.charAt(i));
            }
        }
        return result;
    }
}
