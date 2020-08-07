class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=-1;
        double sum=0;
        int count=0;
        for(int i=0;i<salary.length;i++){
            max = Math.max(salary[i],max);
            min=Math.min(salary[i],min);
        }
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=min&&salary[i]!=max){
                sum+=salary[i];
                count++;
            }
        }
        double avg = sum/count;
        return avg;
        
    }
}
