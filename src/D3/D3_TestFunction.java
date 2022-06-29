package D3;

/**
 * 方法：对功能或者动作的封装
 * public static 返回值类型 方法名(传参1，传参2，传参n，...){
 *     方法体；
 *     return 值；
 * }
 * 方法名(实参1，实参2，实参n, ...);
 *
 *      1，不能在方法中定义方法
 *      2，返回值类型和返回值必须匹配，形参和实参个数及类型要匹配
 *      3，如果写了返回值，必须要写返回值，反之亦然
 *      4，没有返回值，返回值类型为void空，方法体不写return或return后面不跟返回值；
 *      5，return之后不可再写代码。
 */

public class D3_TestFunction {
    /**
     * 定义一个整型加法运算器
     * @param a 整型加数
     * @param b 整型加数
     * @return 整型a和b的加法和
     */
    public static int sum(int a, int b){ // 传参 a, b
        return a + b; // 返回值类型必须和定义方法的类型名一致，返回值可直接定义
    }

    /**
     * 方法的重载：方法的名字相同，参数的个数或类型不同，重载可避免重写调用或方法
     *      重载和返回值没有关系
     *      在执行过程中，程序会自动根据给的参数去寻找对应的方法执行
     * @param a 浮点型加数
     * @param b 浮点型加数
     * @return 浮点型加数a和b的加法和
     */
    public static double sum(double a, double b){
        return a + b;
    }

    /**
     * 定义一个翻转数组的方法
     * @param arr 传入需要翻转的数组
     * @return 传出已翻转的数组
     */
    public  static int[] reverse(int[] arr){
        int[] rev = new int[arr.length]; //数组的定义法1
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // 主方法，主函数，程序的入口
    public static void main(String[] args) {
        // 加法方法
        int sum_int = sum(1,2); // 实参1，2
        System.out.println("执行整型加法结果,sum: " + sum_int); // 3

        // 重载后的浮点型加法
        double sum_double = sum(1,2.2);
        System.out.println("执行浮点型加法结果，sum: " + sum_double); //3.2

        // 数组翻转
        int[] a = new int[]{1, 2, 3, 5, 4, 6};
        int[] rev_a = reverse(a); //方法调用
        for (int i = 0; i < rev_a.length; i++) {
            System.out.println("翻转后数组第" + i + "位：" + rev_a[i]); // 6, 4, 5, 3, 2, 1
        }
    }
}
