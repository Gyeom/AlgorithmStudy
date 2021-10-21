class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashmap = HashMap<Int, Int>()
        
        nums.forEachIndexed { index, value ->
            val complement = target - value
            if (hashmap.containsKey(complement)) {
                return intArrayOf(hashmap.getValue(complement), index)
            }
            hashmap[value] = index
        }
        throw IllegalArgumentException("This problem cannot be solved.")
    }
}