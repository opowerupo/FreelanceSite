package main.java.Easy;

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
public class Reverse {
    public int reverse(int x) {
        int m  = 0;
        int res = 0;
        while (x != 0) {
            m  = x % 10;
            x = x / 10;

            //整数溢出判断
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && m > 7)) return 0;
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && m < -8)) return 0;

            res = res * 10 + m;
        }
        return res;
    }

    public static void main(String[] args) {
        Reverse rev = new Reverse();
        int res = rev.reverse(-123);
        System.out.println(res);
    }
}
