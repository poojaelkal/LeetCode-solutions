class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean isRow=false;
        boolean isCol=false;
        
        for(int i=0;i<col;i++){
            if(matrix[0][i]==0){
                isRow=true;
                break;
            }
        }
        for(int i=0;i<row;i++){
            if(matrix[i][0]==0){
                isCol=true;
                break;
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<row;i++){
            if(matrix[i][0]==0){
                nullifyrow(matrix,i);
            }
        }
        for(int i=1;i<col;i++){
            if(matrix[0][i]==0){
                nullifyCol(matrix,i);
            }
        }
        if(isRow) nullifyrow(matrix,0);
        if(isCol) nullifyCol(matrix,0);
        
    }
    
    public void nullifyrow(int[][] matrix, int row){
        for(int i=0;i<matrix[0].length;i++){
            matrix[row][i]=0;
        }
    }
    public void nullifyCol(int[][] matrix, int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col]=0;
        }
    }
}
