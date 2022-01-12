from typing import List
class Solution:
    def findMin(self, nums: List[int]) -> int:
        left_number = nums[0]
        right_number = nums[-1]

        if left_number < right_number:
            return left_number
        if len(nums) <= 2:
            return nums[-1]

        mid = len(nums) // 2
        mid_number = nums[mid]
        if left_number > mid_number and mid_number < right_number:
            return self.findMin(nums[:mid + 1])
        elif left_number < mid_number and mid_number > right_number:
            return self.findMin(nums[mid:])
