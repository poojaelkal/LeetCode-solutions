class Solution:
    def reformatDate(self, date: str) -> str:
        temp=date.split(" ")
        res=temp[2]+"-"
        month=["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
        m=0
        for i in range(len(month)):
            if temp[1]==month[i]:
                m=i+1
                break
        if m<10:
            res+="0"+str(m)+"-"
        else:
            res+=str(m)+"-"
        d=temp[0]
        dd=d[:-2]
        if int(dd)<10:
            res+="0"+dd
        else:
            res+=dd
        return res
                
        
