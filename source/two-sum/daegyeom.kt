package two_sum

fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashMap = HashMap<Int, Int>()

    nums.forEachIndexed { index, value ->
        val complement = target - value
        if (hashMap.containsKey(complement)) {
            return intArrayOf(hashMap.getValue(complement), index)
        }
        hashMap[value] = index
    }

    throw IllegalArgumentException("This problem cannot be solved.")
}
