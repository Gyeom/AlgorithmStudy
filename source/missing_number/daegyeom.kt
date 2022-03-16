package missing_number

fun missingNumber(nums: IntArray): Int {
    return ((nums.size + 1) * nums.size) / 2 - nums.sum()
}