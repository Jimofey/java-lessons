/**
 * 多态：同一个对象拥有多种形态
 * 作用：把不同的数据类型进行统一，增强程序的扩展性
 * 知识点：
 *      1，向上转型：把子类的对象赋值给父类的变量
 *          缺点：会屏蔽掉子类特有的方法
 *      2，向下转型：把父类的变量转换回子类的变量
 *          语法：转换后的数据类型 转换后的变量 = （转换后的数据类型）转换前的变量
 *          向下转型有风险，java要求必须写强制类型转换
 */

package D4.polymorphism;

public class Client {
    public static void main(String[] args) {
        People people = new People();

//        Dog dog = new Dog();
//        Monkey monkey = new Monkey();
//        Bird bird = new Bird();
        // Animals 为 Dog Monkey Bird的父类，可进行向上转型 - 把子类的对象赋值给父类的变量
        Animals dog = new Dog();
        Animals monkey = new Monkey();
        Animals bird = new Bird();

//        people.feedBird(bird);
//        people.feedDog(dog);
//        people.feedMonkey(monkey);
        // 将People.feedXxx 统一为 People.feedAnimal - 把不同的数据类型进行统一
        people.feedAnimal(dog);
        people.feedAnimal(bird);
        people.feedAnimal(monkey);

        // 向上转型 - 会屏蔽掉子类特有的方法
        // bird.fly();

        // 向下转型 - 必须加上强制转换语句
        Bird eagle = (Bird) bird;
        eagle.fly(); // 向下转型后，可以使用子类特有的方法

    }
}
