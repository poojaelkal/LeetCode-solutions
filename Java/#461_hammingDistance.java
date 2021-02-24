class Solution {
    public int hammingDistance(int x, int y) {
        int diff = x^y;
        int count=0;
        while(diff!=0){
            count+=1;
            diff=diff&(diff-1);
        }
        return count;
    }
}
