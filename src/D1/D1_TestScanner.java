package D1;

import java.util.Scanner;

public class D1_TestScanner {
    public static void main(String[] args) {
        // 1. 创建 new 一个扫描器
        Scanner sc = new Scanner(System.in);

//        // 2. 使用扫描器来获取用户输入
//        int a = sc.nextInt(); // 获取用户输入的整数
//        System.out.println(a + 1);
//
//        double d = sc.nextDouble(); // 获取用户输入的小数
//        System.out.println("d = " + d);
//
//        String s = sc.nextLine(); // 获取用户输入的字符串用nextLine
//        // 无法用Scanner连续输出时同时获取String类型的输入
//        System.out.println(s);

        //让用户输入两个数xy，计算x + y的结果
        System.out.println("请输入x和y的值：");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("x + y = " + (x + y));
    }
}
