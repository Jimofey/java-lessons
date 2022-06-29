package D4;

/**
 * 1, 构造方法：在创建对象的时候，自动调用的方法
 * 语法：
 *      public 类名(传参）{
 *          this.属性 = 传参；
 *          ...
 *      }
 *
 *      1，构造方法没有返回值；
 *      2，new一个对象的时候，会自动调用构造方法，默认的构造方法没有传参，自定义的构造需要new时传入实参
 *      3，Java会自动给每一个类赋予构造方法
 *
 * 作用：在创建对象的时候，给对象设置属性信息
 *
 * 2, 构造方法的重载：是方法即可重载，可以有更多的方法去创建对象
 *      1，使用this()可以访问其他构造方法，从而简化代码
 *      2，避免因传参实参不一致而修改方法和引用
 */

public class D4_CarPublicClass {
    // P1, 成员变量
    String color;
    int speed;
    int seat = 5;
    int wheel = 4;

    // P2, 构造方法
    /*
    区别：
    单独定义方法         public static 返回值类型 方法名(传参）
    定义成员方法         public 返回值类型 方法名(传参）
    定义构造方法         public 类名(传参)
     */
    public D4_CarPublicClass(String color, int speed){
        System.out.println("构造方法设置属性：");
        this.color = color;
        this.speed = speed;
    }

    // P5, 构造方法的重载 - 某一或某些参数特定的情况
    public D4_CarPublicClass(String color, int speed, int seat, int wheel){
        this(color, speed); // this可用于调用当前类中的其他构造方法，简化代码
        // this用于简化当前构造与其他构造重复的部分
        // this语句必须在当前构造的第一句
        System.out.println("重载构造方法设置属性：");
        this.seat = seat;
        this.wheel = wheel;
    }

    // P3, 成员方法
    public void run(){
        System.out.println(this.color + "的车正在行驶");
        System.out.println("车速：" + this.speed);
        System.out.println("座位数：" + this.seat);
        System.out.println("车轮数：" + this.wheel + "\n");
    }

    public static void main(String[] args) {
        // P4, 创建对象
        D4_CarPublicClass c1 = new D4_CarPublicClass("绿色",120); // 需要输入构造方法的传参
        D4_CarPublicClass c2 = new D4_CarPublicClass("红色",180);
        /*
         c2.color = "红色"; // 可省略
         c1.speed = 180;
        */
        c1.run();
        c2.run();

        // P6, 重载构造方法的创建对象
        D4_CarPublicClass c3 = new D4_CarPublicClass("粉色", 210, 7, 6);
        c3.run();
    }
}
