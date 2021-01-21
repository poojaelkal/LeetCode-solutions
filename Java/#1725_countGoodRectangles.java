class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int countMax=0;
        int maxLength=0;
        for(int i=0;i<rectangles.length;i++){
            int local = Math.min(rectangles[i][0],rectangles[i][1]);
            if(local>maxLength){
                countMax=1;
                maxLength=local;
            }else if(local==maxLength){
                countMax++;
            }
        }
        return countMax;
        
    }
}
