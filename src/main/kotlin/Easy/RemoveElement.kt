package main.kotlin.Easy


fun removeElement(nums: IntArray, `val`: Int): Int {
    var i: Int = 0
    for (j in nums.indices) {
        if (nums[j] != `val`) {
            nums[i] = nums[j]
            i++
        }
    }
    return i
}

fun main() {
    val nums = intArrayOf(3, 1, 2, 2, 3, 3, 4, 3)
    val `val` = 3
    val res = removeElement(nums, `val`)
    val numsStr = StringBuilder()
    numsStr.append(res)
    numsStr.append(" : [")
    for (i in nums.indices) {
        numsStr.append(nums[i])
        numsStr.append(",")
    }
    numsStr.delete(numsStr.length - 1, numsStr.length)
    numsStr.append("]")

    print(numsStr)
}