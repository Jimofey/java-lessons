/**
 * final关键字：
 *      1，被final修饰的变量不可以被修改
 *      2，被final修饰的方法不可以被重写
 *      3，被final修饰的类不可以被继承
 */

package D4.polymorphism;


//public final class TestFinal extends Dog {} // 3，被final修饰的类不可以被继承

public class TestFinal extends People{
    public final int number = 100; // 1，被final修饰的变量不可以被修改

    public static void main(String[] args) {
        TestFinal tf = new TestFinal();
        // tf.number = 20; // 1，被final修饰的变量不可以被修改
    }

    // public final void human(){} // 2，被final修饰的方法不可以被重写
}