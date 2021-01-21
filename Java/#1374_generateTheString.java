class Solution {
    public String generateTheString(int n) {
        char[] a = new char[n];
        Arrays.fill(a,'a');
       if(n%2==0){
           a[0]='b';
       }
       return new String(a); 
        
    }
}
