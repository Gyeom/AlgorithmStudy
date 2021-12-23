import kotlin.math.max

fun maxSubArray(nums: IntArray): Int {
    var sum = 0
    var maxValue = Integer.MIN_VALUE
    nums.forEach { value ->
        when {
            sum < 0 -> sum = value
            else -> sum += value
        }
        maxValue = max(sum, maxValue)
    }
    return maxValue
}