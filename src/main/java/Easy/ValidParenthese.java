package main.java.Easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 * 输入: "()"
 * 输出: true
 *
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 *
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 *
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 *
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 */
public class ValidParenthese {
    private HashMap<Character, Character> hm = new HashMap<>();

    {
        hm.put('(', ')');
        hm.put('[', ']');
        hm.put('{', '}');
    }

    public boolean isValid(String s) {
        int len = s.length();

        if ("".equals(s)) return true;
        if (len < 2 || len % 2 != 0) return false;

        Stack<Character> sc = new Stack<Character>();
        char c = '1';

        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            if (hm.containsKey(c)) {
                sc.push(c);
            } else if (sc.isEmpty() || c != hm.get(sc.pop())) {
                return false;
            }
        }
        if (sc.isEmpty()) return true;

        return false;
    }

    public static void main(String[] args) {
        ValidParenthese vp = new ValidParenthese();
        boolean res = vp.isValid("(({)})");
        System.out.println(res);
    }
}
