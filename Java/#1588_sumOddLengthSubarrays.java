class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len=1;
        int totalSum=0;
        while(len<=arr.length){
            for(int i=0;i<=arr.length-len;i++){
               int temp=0;
                for(int j=0;j<len;j++){
                    temp+=arr[i+j];
                }
                totalSum+=temp;
            }
            len+=2;
        }
        return totalSum;
    }
}
