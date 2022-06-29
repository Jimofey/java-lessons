/**
 * 抽象：只声明，不实现
 *      1，抽象方法：使用abstract修饰，不可以有方法体，直接以；结尾
 *      2，抽象类：如果类中有抽象方法，则类必须是抽象类
 *
 * 特点：
 *      1，抽象类不可以创建对象，需要重写override抽象方法；
 *      2，抽象类中可以有正常的方法和正常的属性
 *      3，抽象类的子类，必须重写抽象类的抽象方法，否则子类必须是抽象类
 *
 * 作用：
 *      1，通过abstract类可以强制要求子类需要含有哪些方法
 *      2，子类通过继承extends来实现抽象类，子类通过实现implements来实现接口
 */
package D4.testAbstract;

public abstract class testAbstract { // 使用abstract修饰

    int a = 10;
    public int b = 20; // 2，抽象类中可以有正常的方法和正常的属性

    public abstract void eat(); // 使用abstract修饰
    public abstract void flyable();

    public void attack(){ // 2，抽象类中可以有正常的方法和正常的属性
        System.out.println("攻击性");
    }

    public static void main(String[] args) {
        // 1，抽象类不可以创建对象，需要重写override抽象方法；
        // Animal cat = new Animal();
        testAbstract cat = new testAbstract() {
            // 3，抽象类的子类，必须重写抽象类的抽象方法，否则子类必须是抽象类
            @Override
            public void eat() {

            }

            @Override
            public void flyable() {

            }
        };

    }


}
