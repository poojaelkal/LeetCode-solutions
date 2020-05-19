class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        else:
            cols = len(matrix[0])
            rows = len(matrix)
            res = []
            firstRow, firstCol = 0, 0
            while rows>0 and cols>0:
                lastRow = firstRow+rows-1
                lastCol = firstCol+cols-1

                for i in range(cols):
                    res.append(matrix[firstRow][firstCol+i])
                for i in range(1, rows):
                    res.append(matrix[firstRow+i][lastCol])
                for i in range(1,cols):
                    if firstRow!=lastRow:
                        res.append(matrix[lastRow][lastCol-i])
                for i in range(1,rows-1):
                    if firstCol !=lastCol:
                        res.append(matrix[lastRow-i][firstCol])

                firstRow +=1
                firstCol +=1
                rows -=2
                cols -=2

            return res
