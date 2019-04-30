package main.java.Easy;

import java.util.HashMap;
import java.util.Map;

//两数相加
public class TwoSum {
    public int[] twoSum(int[] nums, int target){

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len = nums.length;

        for(int i = 0; i < len; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target - nums[i],i);
        }

        return null;
    }

    public static void main(String[] args){
        TwoSum ts = new TwoSum();
        int[] res = ts.twoSum(new int[]{1,8,6,7},9);
        StringBuilder sb = new StringBuilder(5);
        sb.append("[");
        for(int val : res){
            sb.append(val);
            sb.append(",");
        }
        sb.delete(sb.length() - 1,sb.length());
        sb.append("]");
        System.out.println(sb.toString());
    }
}
