import List
class Solution:
    # 첫번째로 푼거, next_day가 한 번 끝까지 갔다가 다시 돌아오는게 영 맘에 안듬
    """
    def maxProfit(self, prices: List[int]) -> int:
        best_profit = 0
        pre_day = 0
        next_day = 1
        while next_day < len(prices):
            if prices[pre_day] > prices[next_day]:
                pre_day += 1
                next_day = pre_day + 1
            else:
                best_profit = max(best_profit, prices[next_day] - prices[pre_day])
                next_day += 1

        return best_profit
    """
    # 첫번째 코드가 맘에 안들어서 다시 풀어봄
    def maxProfit(self, prices:List[int]) -> int:
        best_profit = 0
        min_prices = 10**4
        for day in range(len(prices)):
            if prices[day] < min_prices:
                min_prices = prices[day]
            else:
                best_profit = max(best_profit, prices[day] - min_prices)
        return best_profit