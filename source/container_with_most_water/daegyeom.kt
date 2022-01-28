package container_with_most_water

fun maxArea(height: IntArray): Int {
    var maximumArea = Int.MIN_VALUE
    var left = 0
    var right = height.size - 1
    while (left < right) {
        val shorterLine = height[left].coerceAtMost(height[right])
        maximumArea = maximumArea.coerceAtLeast(shorterLine * (right - left))
        if (height[left] < height[right]) {
            left++
        } else {
            right--
        }
    }
    return maximumArea
}