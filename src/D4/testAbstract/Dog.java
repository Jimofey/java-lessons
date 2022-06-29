package D4.testAbstract;

public class Dog extends Animal implements testInterface, testInterface2{ // 类- 单继承，接口 - 多实现。
    @Override
    public void eat() {
        System.out.println("狗子吃骨头");
    }

    @Override
    public void fly() {
        System.out.println("狗子做梦会飞");
    }

    public static void main(String[] args) {
        testInterface doggy = new Dog(); // 接口同样具有多态性 - 向上转型
        testInterface2 corgi = new Dog(); // 向上转型
        Animal alai = new Dog(); //  向上转型

        // 对于向上转型的对象，只能使用父类的成员方法
        doggy.eat();
        doggy.fly();
        // corgi.eat(); // testInterface2父类中无eat()方法
        // alai.eat(); // Animal父类中无eat()方法

    }
}
