class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<List<String>>();
        Map<String,List<String>> map=new HashMap<String,List<String>>();
        
        for(String s:strs){
            String orig=s;
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String k=new String(c);
            if(map.containsKey(k)){
                map.get(k).add(orig);
            }else{
                List<String> v = new ArrayList<String>();
                v.add(orig);
                map.put(k,v);
            }
        }
        for(List<String> val:map.values()){
            ans.add(val);
        }
        return ans;
        
    }
}
