class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int[] min = new int[matrix.length];
        int[] max = new int[matrix[0].length];
        Arrays.fill(min,Integer.MAX_VALUE);
        for(int i=0;i<min.length;i++){
            for(int j=0;j<max.length;j++){
                min[i]=Math.min(min[i],matrix[i][j]);
                max[j]=Math.max(max[j],matrix[i][j]);
            }
            
        }
        for(int i=0;i<min.length;i++){
            for(int j=0;j<max.length;j++){
                if(min[i]==max[j]){
                    res.add(min[i]);
                }
            }
        }
        return res;
    }
}
