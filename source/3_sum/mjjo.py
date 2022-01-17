class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:

        def find_remain(i, j):
            remain = -(nums[j] + nums[i])

            if remain in nums[i + 1:j]:
                if [nums[i], remain, nums[j]] not in result:
                    result.append([nums[i], remain, nums[j]])

        result = []
        if len(nums) <= 2:
            return result

        nums = sorted(nums)
        print(nums)
        i = 0
        j = len(nums) - 1

        while i < j:

            temp = j

            while nums[temp] >= 0 and temp > i + 1:
                find_remain(i, temp)
                if nums[temp - 1] == nums[j]:
                    temp -= 1
                temp -= 1
            temp = i

            while nums[temp] <= 0 and temp < j - 1:

                find_remain(temp, j)
                if nums[temp + 1] == nums[i]:
                    temp += 1
                temp += 1

            i += 1
            j -= 1

        return result


