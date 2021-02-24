class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int res=0;
        for(int i=lowLimit;i<=highLimit;i++){
            int s=divide(i);
            map.put(s, map.getOrDefault(s, 0) + 1);
            res = Math.max(res, map.get(s));
        }
        return res;
    }
    public int divide(int num){
        int tSum=0;
        while(num!=0){
                int n = num%10;
                tSum+=n;
                num=num/10;
            }
        return tSum;
    }
}
