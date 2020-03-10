package main.java.Easy;

/**
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 *
 * 1. 1
 * 2. 11
 * 3. 21
 * 4. 1211
 * 5. 111221
 * 6. 312211
 * 7. 13112221
 * 8. 1113213211
 * 9. 31131211131221
 *
 * 1 被读作 "one 1" ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即21。
 * 21 被读作 "one 2", "one 1" （"一个二" , "一个一") , 即 1211。
 *
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 注意：整数顺序将表示为一个字符串。
 *
 * 示例 1:
 * 输入: 1
 * 输出: "1"
 *
 * 示例 2:
 * 输入: 4
 * 输出: "1211"
 */
public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder ans = new StringBuilder();
        ans.append("1");
        String currentStr = null;
        int num = 0;
        char currentChar;
        for (int i = 2; i <= n ; i++) {
            //遍历前一个字符串
            currentStr = new String(ans);
            ans.delete(0,ans.length());
            num = 0;
            currentChar = currentStr.charAt(0);
            for (char c : currentStr.toCharArray()) {
                if(c == currentChar){
                    num++;
                }
                else{
                    ans.append((char)('0'+num));
                    ans.append(currentChar);
                    currentChar = c;
                    num = 1;
                }
            }
            ans.append((char)('0'+num));
            ans.append(currentChar);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        CountAndSay cas = new CountAndSay();
        String res = cas.countAndSay(3);
        System.out.println(res);
    }
}
