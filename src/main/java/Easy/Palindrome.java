package main.java.Easy;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 * 输入: 121
 * 输出: true
 *
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * 进阶:
 * 你能不将整数转为字符串来解决这个问题吗？
 */
public class Palindrome {
    public boolean isPalindrom(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int num = 0;
        while (x > num) {
            num = num * 10 + x % 10;// x%10就是模10 相当于除以10取余数 也就是x末尾的数字
            x /= 10;
        }
        System.out.println(x + " : " + num);
        if (x == num || x == num / 10) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Palindrome pal = new Palindrome();
        boolean res = pal.isPalindrom(12344321);
        System.out.println(res);
    }
}
