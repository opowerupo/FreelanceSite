package main.java.Algorithm.sort;

/** 插入排序
 * 时间复杂度 O(n^2)
 * 空件复杂度 O(1) 是原地排序
 * 稳定
 **/
public class InsertionSort {
    public int[] doInsertion(int[] arr){
        if(arr  == null) return arr;
        int len = arr.length;
        if(len <= 1 ) return arr;

        int value = 0;
        int j = 0;
        for(int i = 1; i < len; i++){
            value = arr[i];
            j = i - 1;
            //数据移动，并通过比较确定数据插入位置
            for(; j >= 0; j--){
                if(arr[j] > value){
                    arr[j+1] = arr[j];//向后移动数据
                } else {
                    //找到数据插入位置
                    break;
                }
            }
            //插入数据
            arr[j+1] = value;
        }

        return arr;
    }
    public static void main(String[] args){
        InsertionSort is = new InsertionSort();
        int[] arr = new int[]{6,4,3,2,5,7,9,1,0,8};

        arr = is.doInsertion(arr);

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
