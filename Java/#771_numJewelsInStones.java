class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char c: stones.toCharArray()){
            if(jewels.contains(Character.toString(c))){
                count++;
            }
        }
        return count;
    }
}
