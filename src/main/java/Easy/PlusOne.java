package main.java.Easy;

/**
 *给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 * 输入: [1,2,3] 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 *
 * 示例 2:
 * 输入: [4,3,2,1] 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] result = null;
        int len = digits.length - 1;

        while(len > 0 && digits[len] == 9){//倒叙循环如果是9 就相当于本位置是0 前一位再加1
            digits[len] = 0;
            len--;
        }

        if(digits[len] == 9){//最终位置是9的话，说明数组整体增加一个位开头是1 其他位置是0
            result = new int[digits.length+1];
            result[0] = 1;
        } else{//不需要进位的情况，就在最终位置加1
            digits[len] += 1;
            result = digits;
        }

        return result;
    }

    public static void main(String[] args){

        PlusOne po = new PlusOne();
        int[] res = po.plusOne(new int[]{1, 9, 9});

        StringBuilder output = new StringBuilder("[");
        for(int i = 0; i < res.length; i++){
            output.append(res[i]).append(",");
        }
        output.delete(output.length()-1,output.length());
        output.append("]");
        System.out.println(output);
    }
}
