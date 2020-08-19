package main.java.Algorithm.sort;

/**
 * 冒泡排序
 * 时间复杂度 O(n^2)
 * 空件复杂度 O(1) 是原地排序
 * 稳定
 */
public class BubbleSort {

    public int[] doBubble(int[] arr){
        int temp = 0;
        int len = arr.length;
        boolean hasChange = false;

        //外层循环表示要冒泡的次数
        for(int i = 0; i < len; i++){
            //内层循环表示要比较那些元素
            for(int j = 0; j < len - i - 1; j++){
                //是否发生比较的标记
                hasChange = false;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    hasChange = true;
                }
            }
            //没有发生比较提前退出循环
            if(!hasChange){
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        BubbleSort bs = new BubbleSort();
        int[] arr = new int[]{6,4,3,2,5,7,9,1,0};
        arr = bs.doBubble(arr);

        StringBuilder arrStr = new StringBuilder(arr.length * 2);
        arrStr.append("[");
        for(Integer i : arr){
            arrStr.append(i);
            arrStr.append(",");
        }
        arrStr.delete(arrStr.lastIndexOf(","),arrStr.length());
        arrStr.append("]");

        System.out.println(arrStr.toString());
    }
}
