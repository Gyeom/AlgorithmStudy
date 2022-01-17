package maximum_product_subarray

import kotlin.math.max
import kotlin.math.min

fun maxProduct(nums: IntArray): Int {
    var minValue = nums[0]
    var maxValue = nums[0]
    var ans = nums[0]
    nums.slice(1..nums.lastIndex).forEach { value ->
        val minValueOfAssistance: Int = maxValue * value
        val maxValueOfAssistance: Int = minValue * value
        maxValue = max(value, max(minValueOfAssistance, maxValueOfAssistance))
        minValue = min(value, min(minValueOfAssistance, maxValueOfAssistance))
        ans = max(ans, maxValue)
    }
    return ans
}