class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int i=0;
        int j=1;
        int n=A.length;
        while(i<n && j<n){
            if(A[i]%2==0){
                i+=2;
            }else if(A[j]%2==1){
                j+=2;
            }else{
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        return A;
    }
}
