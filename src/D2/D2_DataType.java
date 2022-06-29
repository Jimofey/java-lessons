package D2; /**
 * 二进制：
 * 1，计算机如何表示数字？
 *      计算机使用通电 / 不通电 表示0 和 1，组成二进制进而表示数字；
 * 2，二进制和十进制互相转换？
 *      把二进制数从右到左写出2的0次方，2的1次方，2的n次方，对应1位置的数字和就是十进制数；
 *      把十进制数字进行整除2，留下余数，用商继续整除2直到商为0，然后余数倒排，即为二进制数。
 * */

/**
 * 编码
 * 1，ascii码，表示数字、英文字母大小写、特殊字符，共128个，7bit长度补全至8bit
 * 2，gbk码，  表示中文、日文、韩文，共65535个，16bit
 * 3，unicode万国码，32bit，
 *      分支1：ucs-2(16bit)，分支2：ucs-4(32bit)
 * 4，utf-8可变长度的unicode万国码：
 *      英文：8bit 1byte
 *      欧洲文字：16bit 2byte
 *      中文：24bit，3byte
 *
 * Java的2种数据类型：
 *      1，基本数据类型：
 *          整型；
 *          浮点型；
 *          字符型 Char；
 *          布尔型；
 *      2，引用数据类型 - 变量：
 *          字符串 String;
 *          所创建的类。（在面向对象的世界里，变量被称为引用）
 * */

public class D2_DataType {
    public static void main(String[] args) {
        /*
        * 1/4，基本数据类型 - 整型：
        * int整型         32bit，4byte     -21亿～21亿之间
        * byte字节        8bit， 1byte     -128·127        Java程序中最小的数据但愿
        * short短整型     16bit，2byte     -32768～32767
        * long长整型      64bit，8byte      ...
        * */
        byte scoreByte = 90;
        // byte score = 150; // 非法，超出范围
        System.out.println("分数：" + scoreByte);

        short scoreShort = 660;
        System.out.println("分数short：" + scoreShort);

        int people_num = 1300000000;
        System.out.println("我国人口：" + people_num);

        long people_world_num = 6000000000L; // 一般用L结尾，默认情况下数字以int类型存储，需要指定类型
        System.out.println("世界人口：" + people_world_num);

        /*
        * 2/4，基本数据类型 - 浮点型
        * double双精度浮点型      64bit，8byte     精度高，准确性高
        * float 单精度浮点型      32bit，4byte
        * */
        float f = 0.123456789f;
        // float a = 0.123456789; // 非法定义，默认为double，需要指定类型
        System.out.println("Float type displays 8 numbers behind 0: " + f); // float最多保留小数点后8位

        double d = 0.123456789012345678;
        System.out.println("Double type displays 17 numbers behind 0: "+ d); // double最多保留小数点后17位

        /*
        * 3/4，基本数据类型 - 字符型
        * 字符：单一的文字符号，区别与字符串String
        * Char      16bit       unicode万国码标准
        * Char类型的数据可以存放数字，实际为编码对应的字符
        * */
        char c = 'a'; // 必须使用单引号引起来
        System.out.println(c);
        char c_code = 20037;
        System.out.println(c_code); // 实际输出为20037对应unicode编码的字符 - 久

        /*
        * 4/4，基本数据类型 - 布尔型
        * boolean       8bit，1byte      true / false
        * */
    }
}
