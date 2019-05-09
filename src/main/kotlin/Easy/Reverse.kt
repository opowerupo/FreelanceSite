package main.kotlin.Easy

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 * 示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 *
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
private fun reverse(x: Int): Int {
    var i: Int = x
    var m: Int = 0
    var res: Int = 0

    while (i != 0) {
        m = i % 10
        i /= 10

        //整数边界判断
        if (res > Int.MAX_VALUE / 10 || res == Int.MAX_VALUE / 10 && m > 7) return 0
        if (res < Int.MIN_VALUE / 10 || res == Int.MIN_VALUE / 10 && m < -8) return 0

        res = res * 10 + m
    }

    return res
}

fun main() {
    val result: Int = reverse(123)
    println(result)
}