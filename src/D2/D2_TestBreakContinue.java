package D2;

/***
 * break：中断，终止一个循环的进行
 *
 *continue：停止执行当前循环，跳到下一次循环
 */

public class D2_TestBreakContinue {
    public static void main(String[] args) {
        // break：中断，终止一个循环的进行
        for (int i = 1; i <= 20; i++){
            if ( i == 11){
                break;
            }
            System.out.println("i = " + i);
        }

        // continue：停止执行当前循环，跳到下一次循环
        System.out.printf("continue：停止执行当前循环，跳到下一次循环");
        for (int j = 1; j <= 20; j++){
            if (j == 13){
                continue;
            }
            System.out.println("j = " + j);
        }
    }
}
