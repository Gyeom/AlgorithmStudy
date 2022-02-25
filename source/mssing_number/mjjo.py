class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        return len(nums)*(len(nums)+1)//2 -sum(nums)
        
class Solution:
    def missingNumber(self, nums):
        missing = len(nums)
        for i, num in enumerate(nums):
            missing ^= i ^ num
        return missing