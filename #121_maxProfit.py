class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if prices == []:
            return 0
        max_profit, min_price = 0, float('inf')
        for price in prices:
            min_price = min(price, min_price)
            profit = price - min_price
            max_profit = max(max_profit,profit)
        return max_profit
