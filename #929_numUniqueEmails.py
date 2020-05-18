class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        res = set()
        for i in range(len(emails)):
            a = list(emails[i])
            name = []
            for i in a:
                if i != '.' and i != '@' and i != '+':
                    name.append(i)
                if i == '@' or i == '+':
                    break
            ind = a.index('@')
            s = ''.join(name)
            j = ''.join(a[ind:])
            fin = s + j
            res.add(fin)
        return len(res)
