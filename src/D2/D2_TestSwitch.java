package D2;

import java.util.Scanner;

/**
 * switch条件分支语句：
 * switch(变量）{
 *     case 值1：
 *          xxx;
 *          break;
 *     case 值2：
 *          xxx;
 *          break;
 *     ...
 *     default:
 *          xxx;
 *          break;
 * }
 * switch比较少用，更多用if，因其结构和语法比较清晰
 * */

public class D2_TestSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("星期一");
                break; // 无break将发生代码case穿透现象，直接执行匹配case之后的所有case语句，非bug，有其他用途
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("无效的输入");
                break;
        }

        // 无break时，case穿透的用法
        int month = sc.nextInt();

        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("第一季度");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("第二季度");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("第三季度");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("第四季度");
                break;
            default:
                System.out.println("无效的输入");
                break;
        }
    }
}
