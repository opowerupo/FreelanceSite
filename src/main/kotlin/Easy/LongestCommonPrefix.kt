package main.kotlin.Easy

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 */
private fun longestCommonPrefix(strs: Array<String>): String {
    if (strs == null || strs.size == 0) {
        return ""
    }

    var prefix: String = strs[0]
    for (i: Int in 1..strs.size - 1) {
        prefix = findPrefix(strs[i], prefix)
        if ("".equals(prefix)) {
            return ""
        }
    }

    return prefix
}

private fun findPrefix(str: String, prefix: String): String {
    var innerPrefix: String = prefix
    while (str.indexOf(innerPrefix) != 0) {
        innerPrefix = innerPrefix.substring(0, prefix.length - 1)
    }
    return innerPrefix
}

fun main() {
    var res: String = longestCommonPrefix(arrayOf("ac", "ac", "a", "a"))
    print(res)
}