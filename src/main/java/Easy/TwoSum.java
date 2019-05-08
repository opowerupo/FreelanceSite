package main.java.Easy;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] res = ts.twoSum(new int[]{1, 8, 6, 7}, 9);
        StringBuilder sb = new StringBuilder(5);
        sb.append("[");
        for (int val : res) {
            sb.append(val);
            sb.append(",");
        }
        sb.delete(sb.length() - 1, sb.length());
        sb.append("]");
        System.out.println(sb.toString());
    }
}
