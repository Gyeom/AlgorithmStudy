import collections
from typing import List

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        countToNums = collections.Counter(nums)
        
        #count 기반으로 정렬해서 마지막 인덱스만 뽑는거
        """
        sort_list_by_value = sorted(countToNums.values())
        
        if sort_list_by_value[-1] >= 2:
            return True
        else:
            False
        """

        #정렬 안하고 앞에서부터 하나씩 값 비교해서 뽑는거
        for value in countToNums.values():
            if value >= 2:
                return True
        return False