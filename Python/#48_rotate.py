class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        matrix[:]=[[row[col] for row in matrix[::-1]] for col in range(len(matrix[::-1][0]))]
