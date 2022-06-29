package D1;

import java.util.Random;
import java.util.Scanner;

public class D1_TestRandom {
    public static void main(String[] args) {
        // 1. 构建 new 一个随机数生成器
        Random rd = new Random();
        // 2. 生成一个随机数
        int n  = rd.nextInt(100); // n是一个随机数，范围是[0,99]
        // System.out.println(n);

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag){
            System.out.println("请随机输入一个数字：");
            int a = sc.nextInt();

            // 判断
            if (a > n){
                System.out.println("猜大了");
            }else if (a < n){
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了");
                flag = false;
            }
        }
    }
}
