class Solution {
    public String removeOuterParentheses(String s) {
        String result="";
        int open=0;
        String temp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                temp+=Character.toString(s.charAt(i));
                open++;
            }else{
                temp+=Character.toString(s.charAt(i));
                open--;
            }
            if(open==0){
                result+=temp.substring(1,temp.length()-1);
                temp="";
            }
        }
        return result;
    }
}
