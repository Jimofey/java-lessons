package D4.polymorphism;

public class People {
//    public void feedDog(Dog dog){
//        dog.eat();
//    }
//
//    public void feedMonkey(Monkey monkey){
//        monkey.eat();
//    }
//
//    public void feedBird(Bird bird){
//        bird.eat();
//    }

    // 将People.feedXxx 统一为 People.feedAnimal - 把不同的数据类型进行统一
    public void feedAnimal(Animals animal){ // 定义为父类变量，可传入子类对象
        animal.eat(); // eat在父类的方法定义被子类重写
    }

    public final void human(){ // 2，被final修饰的方法不可以被重写
        System.out.println("人是高级动物");
    }
}
