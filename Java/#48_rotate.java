class Solution {
    public void rotate(int[][] m) {
        int n=m.length;
		for(int x=0;x<n/2;x++) {
			for(int y=x;y<n-1-x;y++) {
				int t=m[x][y];
				m[x][y]=m[n-1-y][x];
				m[n-1-y][x] = m[n-1-x][n-1-y];
				m[n-1-x][n-1-y]=m[y][n-1-x];
				m[y][n-1-x]=t;
			}
		}
    }
}
