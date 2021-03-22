class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE, max=0;
        for(int p:prices){
            min=Math.min(min,p);
            int profit=p-min;
            max=Math.max(max,profit);
        }
        return max;
        
    }
}
