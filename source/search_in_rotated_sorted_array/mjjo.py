class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
        def find_target(first:int,last:int,target:int) -> int:
            mid = (first+last)//2
            if nums[mid] == target :
                return mid
            
            elif nums[mid] > target:
                
                return find_target(first,mid-1,target)
                
            else:
                return find_target(mid,last-1,target)
            
            return -1
            
        
        
        def find_lotated(nums,i,j,lotated):
            while j < len(nums)+1:
                if nums[i] > nums[j]:
                    return  j
                i += 1
                j += 1
            return 
        
        
        if len(nums) == 1 and target in nums:
            return 0
        
        elif len(nums) == 1 and target not in nums:
            return -1
        
        lotated = 0
        first = 0
        last = len(nums)-1
        mid = (first+last)//2
        if nums[first] < nums[last]:
            return find_target(first, last,target)
        
        elif nums[first] > nums[mid]:
            lotated = find_lotated(nums,first,first+1,lotated)
        else:
            lotated = find_lotated(nums,mid+1,mid,lotated)
            
        
        if target >= nums[first] and target <= nums[lotated-1]:
            
            return find_target(first, lotated,target)
        
        elif target <= nums[last] and target >= nums[lotated]:
            
            return find_target(lotated, last,target)
        return -1