class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!='0'){
                    count++;
                    sink(grid,i,j);
                }
            }
        }
        return count;
    }
    public void sink(char[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0') return;
        grid[i][j]='0';
        sink(grid,i+1,j);
        sink(grid,i-1,j);
        sink(grid,i,j-1);
        sink(grid,i,j+1);
    }
}
