package D4;

/**
 * this关键字
 */
public class D4_CarTestThis {
    String color;
    int speed;
    int seat = 5;

    public void run(String sky_color){
        /*
        * 默认会有一个this来接收正在执行这个成员方法的对象，从而获取Car的成员变量 - 属性
        * 变量的查找顺序：
        *   方法内找 -> this里找
        * */
        System.out.println(this.color + "的车辆行驶"); // this可帮助区分成员变量和局部比变量
        System.out.println(color + "的车辆行驶"); // 方法内无color变量，等同于this.color
        System.out.println(color + "的车辆行驶在" + sky_color + "的天空下");
        System.out.println(this.color);
        System.out.println((this.speed));
        System.out.println(this.seat);
    }

    public static void main(String[] args) {
        D4_CarTestThis c = new D4_CarTestThis();
        c.color = "白色";
        c.speed = 210;
        c.seat = 3;
        c.run("蓝色"); // 在调用成员方法时，Java会自动将对象传递给方法，在方法中由this来接收当前类的对象
    }
}
