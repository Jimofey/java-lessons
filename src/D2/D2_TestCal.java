package D2; /**
 * 基本数据类型的运算
 * 1，相同的数据类型：
 *      得到的是相同的数据类型，int + int = int
 * 2, 不同的数据类型：
 *      首先把小数据类型自动转换为大数据类型，然后进行计算，得到的计算结果一定是大的数据类型
 * 3，特殊的byte，short，char：
 *      在计算时候，计算机会自动转化成int类型然后再进行计算。
 *      byte + byte = int
 *      结果至少是int
 * */

/**
 * 运算符
 * 1, 算术运算：
 * 加法 +
 * 减法 -
 * 乘法 *
 * 除法 / 整除
 * 余数 %
 *
 * 2, 赋值扩展运算：
 * +=   累加
 * -=   累减
 * *=   累乘
 * /=   累除
 * %=   累余
 *
 * 3, 比较运算：
 * >, <, >=, <=, ==, !=
 * 返回值类型为boolean，true / false
 * */

public class D2_TestCal {
    public static void main(String[] args) {
        // 特殊的计算类型示例
        short s1 = 1;
        // short s2 = s1 + 1; // ❌错误写法，因为计算时已自动转换为int
        short s2 = (short)(s1 + 1);
        System.out.println(s2);

        //累余
        int a = 10;
        int b = 3;
        a %= b;
        System.out.println("a = " + a);

        //一元运算，自加减
        a++; // 不需要赋值等号
        System.out.println("自加法结果 a = " + a); // a = 2
    }
}
