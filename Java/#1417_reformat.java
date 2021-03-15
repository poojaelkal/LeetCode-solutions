class Solution {
    public String reformat(String s) {
        int cd=0;
        int cc=0;
        StringBuffer bfc = new StringBuffer();
        StringBuffer bfd = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                cd++;
                bfd.append(s.charAt(i));
            }else{
                cc++;
                bfc.append(s.charAt(i));
            }
        }
        if(Math.abs(cd-cc)>1){
            return "";
        }
        String start = cd>=cc?bfd.toString():bfc.toString();
        String end = cd<cc?bfd.toString():bfc.toString();
        System.out.println("start -"+start);
        System.out.println("end -"+end);
        StringBuffer res = new StringBuffer();
        int i=0;
        for(i=0;i<start.length();i++){
            res.append(start.charAt(i));
            if(i!=end.length()){
            res.append(end.charAt(i));}
        }
        // res.append(start.charAt(i));
        return new String(res);
    }
}
