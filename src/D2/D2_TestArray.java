package D2;

/**
 * 1，Java中数组的三种表示方法：
 *      类型[] 数组名 = new 类型[大小]
 *      类型[] 数组名 = {数据1， 数据2， 数据3， ...}
 *      类型[] 数组名 = new 类型[]{数据1， 数据2， 数据3， ...}
 *
 * 2，arr.length 表示数组长度，可用于数组遍历
 */

public class D2_TestArray {
    public static void main(String[] args) {
        int[] arr0 = new int[5];
        int[] arr1 = {10, 11, 12, 13, 14, 15};
        int[] arr2 = new int[]{1, 2, 3};

        System.out.println(arr1[0]); // 从数组arr1中获取第0位置的数据
        // System.out.println(arr1[6]); // ❌数组下标越界

        arr1[4] = 16; // 数组赋值

        // 数组遍历 - 查看数组中所有的数据
        System.out.println("数组遍历arr[1]: ");
        for(int i = 0; i < arr1.length; i++){ // arr.length 表示数组有多少个元素 -> 数组长度
            System.out.println(arr1[i]);
        }

        /*
        寻找数组中最大的数
         */
        int max = arr1[0]; // 初始化最大值为第0位
        for (int i = 1; i < arr1.length; i++) { //从第1位开始比较
            if (arr1[i] > max){
                max = arr1[i]; // 如果数组数据比max大，则赋值给max
            }
        }
        System.out.println("arr1中的最大值为：" + max); // 16

        /*
        计算数组所有数的和
         */
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("arr1中所有数的和为：" + sum); // 77
    }
}
