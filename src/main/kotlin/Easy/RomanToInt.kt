package main.kotlin.Easy

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *
 * 字符           数值
 *  I             1
 *  V             5
 *  X             10
 *   L             50
 *  C             100
 *  D             500
 *  M             1000
 *
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。
 * 数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
 * 同样地，数字 9 表示为 IX。
 *
 * 这个特殊的规则只适用于以下六种情况：
 *  I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 *  X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 *  C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 * 输入: "III"
 * 输出: 3
 *
 * 示例 2:
 * 输入: "IV"
 * 输出: 4
 *
 * 示例 3:
 * 输入: "IX"
 * 输出: 9
 *
 * 示例 4:
 * 输入: "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 *
 * 示例 5:
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */

class RomanToInt {
    private val romanMap: HashMap<Char,Int> = hashMapOf<Char,Int>()

    init {
        romanMap['I'] = 1
        romanMap['V'] = 5
        romanMap['X'] = 10
        romanMap['L'] = 50
        romanMap['C'] = 100
        romanMap['D'] = 500
        romanMap['M'] = 1000
    }

    fun romanToInt(roman: String): Int{
        val len: Int = roman.length - 1;
        var res: Int? = romanMap[roman.get(len)]

        for (i: Int in len downTo 1){
            res = sumTwoRoman(roman.get(i),roman.get(i-1),res)
        }
        return res!!
    }

    private fun sumTwoRoman(c1: Char?,c2: Char?,res: Int?): Int? {
        val i1: Int? = romanMap[c1]
        val i2: Int? = romanMap[c2]
        val i3: Int = i1!! + i2!!
        var r: Int = res!!
        if(i1 > i2 &&(i3 % 6 == 0 || i3 % 11 == 0)){
            r -= i2
        }else{
            r += i2
        }

        return r
    }

}

fun main(){
    val rti =  RomanToInt();
    val res = rti.romanToInt("LIV")
    println(res)
}