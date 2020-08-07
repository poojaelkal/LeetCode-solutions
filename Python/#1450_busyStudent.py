class Solution:
    def busyStudent(self, startTime: List[int], endTime: List[int], queryTime: int) -> int:
        count =0;
        for i in range(len(startTime)):
            if startTime[i]==queryTime or endTime[i]==queryTime:
                print("second")
                count+=1
            elif startTime[i]<queryTime and endTime[i]>queryTime:
                print("forth")
                count+=1
        return count
