class Solution:
    def removeSubfolders(self, folder: List[str]) -> List[str]:
        folder.sort()
        res=[folder[0]]
        prev=folder[0]+"/"
        prev_n=len(folder[0])+1
        for each in folder[1:]:
            if each[:prev_n]!=prev:
                res.append(each)
                prev=each+"/"
                prev_n=len(each)+1
        return res
                
