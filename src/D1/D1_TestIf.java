package D1;

import java.util.Scanner;

public class D1_TestIf {
    public static void main(String[] args) {
        System.out.println("请输入金额：");
        Scanner sc = new Scanner(System.in);

        // 获取金额
        double money = sc.nextDouble();

        // 进行判断
        if (money >= 10000){
            System.out.println("您的余额为：" + money);
        }else if (money > 5000){
            System.out.println("您的余额尚可");
        }else {
            System.out.println("您的余额不足");
        }
        System.out.println("结束");
    }
}
