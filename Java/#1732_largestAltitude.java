class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int maxAlt=0;
        for(int i=0;i<gain.length;i++){
            alt=gain[i]+alt;
            maxAlt = Math.max(alt,maxAlt);
            System.out.println(alt+" "+maxAlt);
        }
        return maxAlt;
    }
}
