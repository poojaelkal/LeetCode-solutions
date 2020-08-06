class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int count=0;
        int[][] res = new int[n][m];
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<m;j++){
                res[indices[i][0]][j] = res[indices[i][0]][j] +1;
            }
            for(int k=0;k<n;k++){
                res[k][indices[i][1]] = res[k][indices[i][1]] +1;
            }
        }
       for(int i=0;i<res.length;i++){
           for(int j=0;j<res[i].length;j++){
               if(res[i][j]%2!=0){
                   count+=1;
               }
           }
       }
        return count;
    }
}
