package three_sum

import java.util.*


fun threeSum(nums: IntArray): List<List<Int>> {
    Arrays.sort(nums)
    val answer: MutableList<List<Int>> = LinkedList()
    for (i in 0 until nums.size - 2) {
        if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
            var lowNumber = i + 1
            var highNumber: Int = nums.size - 1
            val sum: Int = 0 - nums[i]
            while (lowNumber < highNumber) {
                if (nums[lowNumber] + nums[highNumber] == sum) {
                    answer.add(listOf(nums[i], nums[lowNumber], nums[highNumber]))
                    while (lowNumber < highNumber && nums[lowNumber] == nums[lowNumber + 1]) lowNumber++
                    while (lowNumber < highNumber && nums[highNumber] == nums[highNumber - 1]) highNumber--
                    lowNumber++
                    highNumber--
                } else if (nums[lowNumber] + nums[highNumber] < sum) lowNumber++ else highNumber--
            }
        }
    }
    return answer
}
