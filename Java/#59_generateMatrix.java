class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=n-1;
        int count=1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int c=colStart;c<=colEnd;c++){
                res[rowStart][c]=count++;
            }
            for(int r=rowStart+1;r<=rowEnd;r++){
                res[r][colEnd]=count++;
            }
            if(rowStart<rowEnd && colStart<colEnd){
                for(int c=colEnd-1;c>colStart;c--){
                    res[rowEnd][c]=count++;
                }
                for(int r=rowEnd;r>rowStart;r--){
                    res[r][colStart] = count++;
                }
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        return res;
        
    }
}
