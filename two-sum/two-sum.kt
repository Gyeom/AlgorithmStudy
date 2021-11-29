class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numberToIndex = HashMap<Int, Int>()
        
        nums.forEachIndexed { index, value ->
            val complement = target - value
            if (numberToIndex.containsKey(complement)) {
                return intArrayOf(numberToIndex.getValue(complement), index)
            }
            numberToIndex[value] = index
        }
        throw IllegalArgumentException("This problem cannot be solved.")
    }
}