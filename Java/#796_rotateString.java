class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length()) return false;
        if(A.equals(B)) return true;
        String s = A+A;
        return s.contains(B);

    }
}
