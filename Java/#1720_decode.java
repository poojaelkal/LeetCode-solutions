class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length+1];
        result[0]=first;
        for(int i=0,j=1;i<encoded.length;i++,j++){
            int temp = first^encoded[i];
            result[j] = temp;
            first=temp;
        }
        return result;
    }
}
