class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length==1){
            return mat[0][0];
        }
        int sum=0;
        for(int i=0,j=mat.length-1;i<mat.length&&j>-1;i++,j--){
            sum+=mat[i][i];
            sum+=mat[j][i];
        }
        if(mat.length%2==1){
        int t=(mat.length-1)/2;
        return sum-mat[t][t];
        }
        return sum;
    }
}
