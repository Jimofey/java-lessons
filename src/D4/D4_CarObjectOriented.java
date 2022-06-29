package D4;

/**
 * 1，面向对象重点概述：
 *      1，类与对象 - 封装
 *      2，构造方法 - this, super
 *      3，访问权限 - public, private, default
 *      4，继承 - extends
 *      5，⚠️多态（最重要）
 *      6，抽象和接口 - abstract - 规定子类必须实现的方法, implement interface - 多实现
 *      7，内存分析 - 栈，堆，代码区，数据区
 *
 * 2，面向对象和面向过程：
 *      面向过程：侧重于过程。
 *          优点：简单；
 *          代码量大之后维护性差；
 *      面向对象：侧重于对象。程序员从上帝视角，创建一个大象对象，告诉大象如何进冰箱
 *          优点：可扩展性强
 *          缺点：上手相对较难
 *
 * 3，类与对象：
 *      类：即造车的图纸
 *          属性：这一类事物共有的共同属性，如车类图纸的color，speed，seat
 *          动作：这一类事物共同能执行的功能，如车类所能执行的功能
 *      对象：使用类创建的具体某一东西，如用车类图纸具体参数后造的车
 *
 *      1，类：用class来定义
 *      2，属性：成员变量，是直接写在类中的变量
 *      3，动作：成员方法，不写static的方法就是成员方法
 *      4，创建对象：类名 引用 = new 类();
 *
 */

// 1，定义一个Car的类
public class D4_CarObjectOriented { // class Car
    // 2，定义Car类的成员变量 - 属性
    String color;
    int speed; // 未定义默认值则为null
    int seat = 5; // 可直接先定义默认值

    // 3，定义Car类的成员方法 - 动作
    public void run(){
        System.out.println("车辆行驶");
    }

    public static void main(String[] args) {
        // 4，创建对象，类名 引用 = new 类();
        D4_CarObjectOriented c1 = new D4_CarObjectOriented();

        // 5，执行车的成员方法 - 动作
        c1.run();

        // 6， 指定车的成员变量 - 属性
        c1.color = "Green";
        c1.speed = 120;
        c1.seat = 2; // 定义了默认值的成员变量也可更改
        // 未被定义的不存在的成员变量不可被赋值
        System.out.println("C1 seat: " + c1.seat); // 2

        // 7，创建第2个对象
        D4_CarObjectOriented c2 = new D4_CarObjectOriented();
        c2.seat = 5;
        c2.color = "Red";
        c2.speed = 180;
        c2.run();
    }
}
