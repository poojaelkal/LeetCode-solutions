class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i=left;i<right+1;i++){
                if(selfDividing(i)){
                    res.add(i);
                }
        }
        return res;
    }
    
    public boolean selfDividing(int n){
        int original=n;
        while(n>0){
            if(n%10==0) return false;
            if(original%(n%10)!=0) return false;
            n/=10;
            
        }
        return true;
    }
}
