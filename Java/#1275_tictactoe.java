class Solution {
    public String tictactoe(int[][] moves) {
        int[] row = new int[3];
        int[] col=new int[3];
        int n=3;
        int d1=0;
        int d2=0;
        for(int i=0;i<moves.length;i++){
            int r=moves[i][0];
            int c=moves[i][1];
            if(i%2==0){
                //player 1
                row[r]++;
                col[c]++;
                if(r==c) d1++;
                if((r+c)==(n-1)) d2++;
                if(row[r]==n || col[c]==n || d1==n || d2==n) return "A";
            }else{
                //player 2
                row[r]--;
                col[c]--;
                if(r==c) d1--;
                if((r+c)==(n-1)) d2--;
                if(row[r]==-n || col[c]==-n || d1==-n || d2==-n) return "B";
            }
        }
        return moves.length<9?"Pending":"Draw";
    }
}
