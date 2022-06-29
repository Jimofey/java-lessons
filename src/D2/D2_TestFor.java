package D2;

/**
 * for循环语句
 * for(语句1；语句2；语句3）{
 *     循环体；
 * }
 *      先执行语句1；后判断语句2，真则执行循环体；然后执行语句3，假则不循环
 * */

public class D2_TestFor {
    public static void main(String[] args) {
        // int i= 1;
        for (int i = 1; i <= 10; i++){
            System.out.println("i = " + i);
        }

        int j = 1;
        while(j <= 10){
            System.out.println("j = " + j);
            j++;
        }
    }
}
