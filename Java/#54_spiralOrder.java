class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int rowStart=0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd=matrix[0].length-1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int c=colStart;c<=colEnd;c++){
                res.add(matrix[rowStart][c]);
            }
            for(int r=rowStart+1;r<=rowEnd;r++){
                res.add(matrix[r][colEnd]);
            }
            if(rowStart<rowEnd && colStart<colEnd){
                for(int c=colEnd-1;c>colStart;c--){
                    res.add(matrix[rowEnd][c]);
                }
                for(int r=rowEnd;r>rowStart;r--){
                   res.add(matrix[r][colStart]);
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
