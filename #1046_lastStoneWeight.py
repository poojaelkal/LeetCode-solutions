class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones.sort(reverse = True)
        print(stones)
        while len(stones) != 1:
            stones.sort(reverse = True)
            m = stones[0]
            n = stones[1]
            if m > n:
                print("inside m>n")
                stones[0] = m - n
                stones.remove(stones[1])
            elif n > m:
                print("inside n>m")
                stones[1] = n - m
                stones.remove(stones[0])
            else:
                stones[0] = 0
                stones.remove(stones[1])
        return stones[0]
