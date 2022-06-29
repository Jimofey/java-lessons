package D2;

import java.util.Scanner;

public class D2_Test {
    public static void main(String[] args) {

        /*
         * 【题目1】，鸡兔合笼，提供脚的数量，求鸡和兔可能的数量。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Foot: ");
        int foot = sc.nextInt();

        for (int chicken = 0; chicken <= foot / 2; chicken++) {

            int rabbit = (foot - chicken * 2) / 4;

            if ((foot - chicken * 2) % 4 == 0){
                System.out.println("Chicken: " + chicken + ", rabbit: " + rabbit);
            }
        }


        /*
         * 【题目2】，水仙花数指一个3位数，它的每个位伤的数字的3次幂只喝等于它本身，让用户任意输入，判断其是否为水仙花数。
         * 例：1^3 + 5^3 + 3^3 = 153
         */

        // 列举所有水仙花数
        for (int i = 100; i <= 999; i++) {
            int d3 = i / 100; // 153 / 100 = 1
            int d2 = i / 10 % 10; // 153 / 10 = 15 % 10 = 1...5
            int d1 = i % 10; // 153 / 10 = 15...3
            int sum = d3 * d3 * d3 + d2 * d2 * d2 + d1 * d1 * d1;

            if (sum == i){
                System.out.println(i + "是一个水仙花数");
            }
        }

        // 输入指定数字判断
        System.out.println("Number: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999){
            int d3 = num / 100; // 153 / 100 = 1
            int d2 = num / 10 % 10; // 153 / 10 = 15 % 10 = 1...5
            int d1 = num % 10; // 153 / 10 = 15...3
            int sum = d3 * d3 * d3 + d2 * d2 * d2 + d1 * d1 * d1;

            if (sum == num){
                System.out.println(num + "是一个水仙花数");
            } else {
                System.out.println(num + "并非一个水仙花数");
            }
        } else {
            System.out.println(num + "并非一个水仙花数");
        }
    }
}
