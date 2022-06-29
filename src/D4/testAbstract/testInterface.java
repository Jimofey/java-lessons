/**
 * 接口
 * 类- 单继承，接口 - 多实现。
 * 接口使用interface来声明
 * 特点：
 *      1，接口同样具有多态性
 *      2，接口是一种特殊的抽象类，其方法都是公开的抽象方法 public abstract
 *      3，接口中的变量都是全局静态变量 public static final
 *      4，接口和接口通过继承extends，接口和类只能是实现implements
 *      5，抽象类中可以有正常的属性和方法，接口中只能有静态属性和抽象方法
 * 作用：
 *      1，接口可以让子类中多实现
 *      2，接口可以把不相关的东西进行整合
 */

package D4.testAbstract;

public interface testInterface { // 使用interface修饰
    // 静态变量
    int a = 10;
    public static final int b = 20; // public static为灰色，表示其默认类型即公开静态最终，默认省略

    // 抽象方法
    void eat();
    public abstract void fly(); // public abstract为灰色，表示其默认类型为公开抽象方法，默认省略

    public static void main(String[] args) {
        // b = 30; // 接口中的变量都为公开静态最终，不能修改
    }
}
