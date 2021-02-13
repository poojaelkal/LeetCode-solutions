class Solution {
    public int minReorder(int n, int[][] connections) {
        Set<Integer> s = new HashSet<Integer>();
        int change=0;
        s.add(0);
        while(s.size()<n){
        for(int i=0;i<connections.length;i++){
            int u = connections[i][0];
            int v = connections[i][1];
            if(!s.contains(u)&&s.contains(v)){
                s.add(u);
            }
            else if(s.contains(u)&&!s.contains(v)){
                s.add(v);
                change++;
            }
        }
        }
        return change;
    }
}
