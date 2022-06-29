package D4.polymorphism;

public class Bird extends Animals{
    // 重写父类的eat方法
    public void eat(){
        System.out.println("喂鸟儿吃虫子");
    }

    public void fly(){
        System.out.println("鸟儿翱翔天空");
    }
}
