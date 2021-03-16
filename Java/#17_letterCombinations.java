class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0){
		    return new ArrayList<String>();}
        Map<Character,String> map = new HashMap(){
            {  put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");}
        };
        List<String> res = new ArrayList<String>();
        StringBuffer bf = new StringBuffer();
        int start=0;
        dfs(digits,res,bf,start,map);
        return res;
    }
    
    public void dfs(String digits, List<String> res, StringBuffer bf, int start, Map<Character, String> map){
        
        if(start==digits.length()){
            res.add(bf.toString());
        }else{
            String tmp = map.get(digits.charAt(start));
            for(int i=0;i<tmp.length();i++){
                bf.append(tmp.charAt(i));
                dfs(digits,res,bf,start+1,map);
                bf.deleteCharAt(bf.length()-1);
            }
        }
    }
    
}
