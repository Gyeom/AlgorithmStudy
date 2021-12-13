class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        right_list, left_list, result_list = [0] * len(nums),[0] * len(nums),[0] * len(nums)
        
        right_list[-1] = 1
        left_list[0] = 1
        
        for index in range(1,len(left_list)):
            left_list[index] = left_list[index-1] * nums[index-1]
        
        for index in range(len(right_list)-2,-1,-1):
            right_list[index] = right_list[index+1] * nums[index+1]
        
        for index in range(len(nums)):
            result_list[index] = left_list[index] * right_list[index]
        return result_list
        