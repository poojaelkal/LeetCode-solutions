class Solution {
    public String destCity(List<List<String>> paths) {
        Set s=new HashSet<>();
        for(List<String> city:paths){
            s.add(city.get(0));
        }
        for(List<String> city:paths){
            if(!s.contains(city.get(1))){
                return city.get(1);
            }
        }
        return "";
    }
}
