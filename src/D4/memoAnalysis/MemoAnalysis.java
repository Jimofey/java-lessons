/**
 * 1，内存分析：
 *  Java中内存分成四个部分：
 *      1，堆：主要存放对象
 *           1A2B = ["堆", 1, "对象"],
 *           2A3B = ["栈", 2, "局部变量，基本数据类型的变量"],
 *           3A4D = ["代码区", 3, "类和方法"],
 *           4A5D = ["数据区", 4, "常量池和静态变量"]
 *
 *      2，栈：局部变量，以及基本数据类型的变量
 *           ❌（成员变量）name, item, content, ❌（静态变量）num
 *           int a
 *           p1, p2, p3, p4，这四个类类型的变量分别指向四个对象的内存地址
 *
 *      3，代码区：类和方法
 *           ParaPassing，❌（构造方法）
 *
 *      4，数据区：常量池和静态变量
 *           num
 *
 */

package D4.memoAnalysis;

public class MemoAnalysis {
    // 成员变量
    private String name;
    private int item;
    private String content;

    public static int num = 0;

    public MemoAnalysis(String name, int item, String content) {
        this.name = name;
        this.item = item;
        this.content = content;

        num++; // 统计已创建对象的人数
    }

    public static void main(String[] args) {
        int a = 10;
        MemoAnalysis p1 = new MemoAnalysis("堆", 1, "对象");
        MemoAnalysis p2 = new MemoAnalysis("栈", 2, "局部变量，基本数据类型的变量");
        MemoAnalysis p3 = new MemoAnalysis("代码区", 3, "类和方法");
        MemoAnalysis p4 = new MemoAnalysis("数据区", 4, "常量池和静态变量");

        System.out.println(MemoAnalysis.num);
    }
}
