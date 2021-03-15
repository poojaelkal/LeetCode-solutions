class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<Integer>();
        Stack<String> res = new Stack<String>();
        res.push("");
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int start=i;
                while(i<s.length()-1&& Character.isDigit(s.charAt(i+1))){i++;}
                System.out.println(s.substring(start,i+1));
                nums.push(Integer.parseInt(s.substring(start,i+1)));
            }else if(c=='['){
                res.push("");
            }else if(c==']'){
                String r = res.pop();
                int times = nums.pop();
                StringBuilder sb = new StringBuilder();
                while(times>0){
                    sb.append(r);
                    times--;
                }
                res.push(res.pop()+ new String(sb));
            }else{
                res.push(res.pop()+Character.toString(c));
            }
        }
        return res.pop();
    }
}
