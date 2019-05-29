package main.java.Easy;

/**
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 * 如果不存在，则返回 -1。
 *
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * 解题：
 * http://www.ruanyifeng.com/blog/2013/05/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm.html
 * https://blog.csdn.net/v_july_v/article/details/7041827
 */
public class Strstr {
    //暴力法
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if (nlen == 0) {
            return 0;
        }
        int t = nlen - 1;
        for (int i = 0; i < hlen; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + t < hlen && haystack.substring(i, i + nlen).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    //sunday算法
    public int strStr_sunday(String haystack, String needle) {

        return 0;
    }

    //kmp算法
    public int strStr_kmp(String haystack, String needle) {

        return 0;
    }

    public static void main(String[] args) {
        Strstr ss = new Strstr();
        int res = ss.strStr("mississippi", "issip");
        System.out.println(res);
        String s = "ab";
        s.indexOf("a");
    }
}
