class Solution:
    def maxProduct(self, nums: List[int]) -> int:

        max_so_far = min_so_far = result = nums[0]

        for num in nums[1:]:
            max_so_far, min_so_far = max(num, num * max_so_far, num * min_so_far), min(num, num * max_so_far, num * min_so_far)
            result = max(max_so_far)
        return result