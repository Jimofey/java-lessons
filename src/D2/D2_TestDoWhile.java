package D2;

public class D2_TestDoWhile {
    public static void main(String[] args) {
        // while 先判断后执行
        int j = 1;
        while(j <= 10){
            System.out.println("j = " + j);
            j++;
        }

        //do...while 先执行后判断，至少执行一次
        int i = 10;
        do {
            System.out.println("i = " + i);
            i--;
        } while(i >= 0);
    }
}
