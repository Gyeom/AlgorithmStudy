package contains_duplicate

fun containsDuplicate(nums: IntArray): Boolean {
    val setOfNumbers = hashSetOf<Int>()
    nums.forEach { number ->
        if(!setOfNumbers.add(number)) return true
    }
    return false
}