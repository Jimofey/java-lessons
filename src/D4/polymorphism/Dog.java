package D4.polymorphism;

// 3，被final修饰的类不可以被继承
public final class Dog extends Animals{
    // 重写父类的eat方法
    public void eat(){
        System.out.println("喂狗子吃骨头");
    }
}
