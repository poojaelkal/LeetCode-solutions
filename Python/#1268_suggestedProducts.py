class Solution:
    def suggestedProducts(self, products: List[str], searchWord: str) -> List[List[str]]:
        products.sort()
        res=[]
        i=0
        while i<len(searchWord):
            temp=searchWord[:i+1]
            t=[]
            for w in products:
                if w.startswith(temp) and len(t)<3:
                    t.append(w)
            res.append(t)
            i+=1
        return res
                    
                
        
