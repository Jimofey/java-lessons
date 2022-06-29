package D1;

public class D1_TestVariants {
    public static void main(String[] args) {
        /*
         1，变量类型_Int
         */
//        先声明一个变量
//        int a = 10;
//        System.out.println(a);
//        a = 20;
//        System.out.println(a);


        int a =10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 如果运算两端都为int，结果为int型
        System.out.println(a % b); // 计算余数，取余操作

        /*
         2，变量类型_Double
         */
        double prince = 1.25;
        System.out.println(prince);

        prince = prince + 0.15; // 赋值
        System.out.println(prince);

        prince = prince - 0.01;
        System.out.println(prince);

        double total = prince * 3; //double类型的计算，得到的都是double
        // double类型的计算，得到的还是double类型，不能定义一个整型并被赋值
        System.out.println(total);

        System.out.println(prince / 100); // 除法
        System.out.println(prince % 2); // 取余数

        /*
         3，变量类型_Boolean
         */
        double money = 1000;
        double price = 20000;

//        System.out.println(money > price); // false
//        System.out.println(money < price); // true
//        System.out.println(money == price); // false, 比较符==

        System.out.println(1000 == 1000); // true
        System.out.println(1000 == 999); // false
        System.out.println(1000 != 999); // true

        /*
         4，变量类型_String
         */
        String s1 = "周杰伦 ";
        String s2 = "七里香";
        System.out.println(s1 + s2); // 字符串拼接

        System.out.println(1 + 1 + s1); // 2周杰伦

        int sa = 10;
        int sb = 20;
        System.out.println("sa + sb = " + (sa + sb)); //运算过程，从左到右，先算括号
    }
}
