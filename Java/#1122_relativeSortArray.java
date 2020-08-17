class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[1001];
        for(int a:arr1){
            res[a]++;
        }
        int i=0;
        for(int a:arr2){
            while(res[a]>0){
                arr1[i]=a;
                i++;
                res[a]--;
            }
        }
        for(int j=0;j<res.length;j++){
            while(res[j]>0){
                arr1[i]=j;
                res[j]--;
                i++;
            }
        }
        return arr1;
    }
}
