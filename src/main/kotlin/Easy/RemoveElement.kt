package main.kotlin.Easy


fun removeElement(nums: IntArray, `val`: Int): Int {
    var i: Int = 0
    for (j in 0..nums.size - 1) {
        if (nums[j] != `val`) {
            nums[i] = nums[j]
            i++
        }
    }
    return i
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    val `val`
    val res = removeElement()
}