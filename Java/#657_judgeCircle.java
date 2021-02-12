class Solution {
    public boolean judgeCircle(String moves) {
        int LR=0;
        int UD=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                LR++;
            }else if(moves.charAt(i)=='R'){
                LR--;
            }else if(moves.charAt(i)=='U'){
                UD++;
            }else{
                UD--;
            }
        }
        return (LR==0&&UD==0);
    }
}
