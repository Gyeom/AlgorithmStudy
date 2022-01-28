class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height)-1
        water = 0
        
        while left < right:
            water_height = min(height[left], height[right])
            
            water_width = right - left
            
            water = max(water, water_height * water_width)
                
            if water_height == height[left]:
                left +=1
            else:
                right -=1
             
        return water
        
        