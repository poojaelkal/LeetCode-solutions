class Solution {
    public String reformatDate(String date) {
        String res="";
        String[] temp=date.split(" ");
        res+=temp[2]+"-";
        String[] month={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int m=0;
        for(int i=0;i<month.length;i++){
            if(temp[1].equals(month[i])){
                m=i+1;
                break;
            }
        }
        if(m<10){
            res+="0"+m+"-";
        }else{
            res+=m+"-";
        }
        String d=temp[0].substring(0,temp[0].length()-2);
        int n = Integer.parseInt(d);
        if(n<10){
            res+="0"+d;
        }else{
            res+=d;
        }
        return res;
    }
}
