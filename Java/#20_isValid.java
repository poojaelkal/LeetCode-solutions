class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='(' || c=='[' || c=='{') s1.push(c);
            else{
                if(!s1.isEmpty()){
                char open=s1.pop();
                if(c==')' && open=='(') continue;
                else if(c==']' && open=='[') continue;
                else if(c=='}' && open=='{') continue;
                else return false;
                }else return false;
            }
        }
        return s1.isEmpty();
    }
}
