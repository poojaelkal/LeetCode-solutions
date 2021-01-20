class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i=s.length()-1;
        while(i>-1){
            if(s.charAt(i)!='#'){
                int t = Integer.parseInt(Character.toString(s.charAt(i)))+96;
                sb.append(Character.toString((char)t));
                i--;
            }else{
                String n = Character.toString(s.charAt(i-2))+Character.toString(s.charAt(i-1));
                int t = Integer.parseInt(n)+96;
                sb.append(Character.toString((char)t));
                i-=3;
            }
        }
        sb.reverse();
        return new String(sb);
    }
}
