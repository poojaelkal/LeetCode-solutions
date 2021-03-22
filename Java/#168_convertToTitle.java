class Solution {
    public String convertToTitle(int columnNumber) {
        String res="";
        while(columnNumber!=0){
            res=(char)('A'+(columnNumber-1)%26)+res;
            columnNumber=(columnNumber-1)/26;
        }
        return res;
    }
}
