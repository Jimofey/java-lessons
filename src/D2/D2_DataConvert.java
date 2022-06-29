package D2;

/**
 * 基本数据类型计算
 * int  32bit, 4byte
 * long 64bit, 8byte
 * 顺序：数据量的大小：
 *      byte -> short, char -> int -> long -> float -> double
 * 小数据类型 -> 大数据类型：安全的，直接转化
 * 大数据类型 -> 小数据类型：不一定安全，可能会溢出，必须要强制转换：
 *      (转换之后的类型) 变量
 * */
public class D2_DataConvert {
    public static void main(String[] args) {
        // 小数据类型转大数据类型
        int a = 10;
        long b = a;
        System.out.println("int转换为long之后的树脂：" + b);

        // 大数据类型转小数据类型
        long c = 10000000000000000L;
        int d = (int) c; // 强制转换
        System.out.println(d); // 程序溢出（截取64bit的后半段的值），d的值没有意义
        c = 1000;
        d = (int) c;
        System.out.println(d);
    }
}
