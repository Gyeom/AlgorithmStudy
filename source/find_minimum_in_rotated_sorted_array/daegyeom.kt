package find_minimum_in_rotated_sorted_array

fun findMin(nums: IntArray): Int {
    return nums.sortedArray().first()
}