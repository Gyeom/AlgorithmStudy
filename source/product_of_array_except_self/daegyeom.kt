package product_of_array_except_self

fun productExceptSelf(nums: IntArray): IntArray {
    val output = IntArray(nums.size) { 1 }
    var assistant = 1
    for (index in nums.indices) {
        output[index] *= assistant
        assistant *= nums[index]
    }
    assistant = 1
    for (index in nums.size - 1 downTo 0) {
        output[index] *= assistant
        assistant *= nums[index]
    }
    return output
}