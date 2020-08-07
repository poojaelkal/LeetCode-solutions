class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            for(int j=0, n = A[i].length-1;j<=n;j++,n--){
                int t = A[i][j]^1;
                A[i][j] = A[i][n]^1;
                A[i][n]=t;
                
            }
        }
        return A;
    }
}
