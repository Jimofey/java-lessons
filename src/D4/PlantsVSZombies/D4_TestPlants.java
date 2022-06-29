package D4.PlantsVSZombies;

/**
 * 成员方法： public 返回值类型 方法名(传参类型  传参名)
 *      1，传参类型：对于传入的是一个对象，对象的类型是 类，所以传参类型应为类名
 *              类名 对象名 = new 类名(成员属性1，成员属性2，...);
 *      2，传参名：本身无其他关联
 */

public class D4_TestPlants {
    // 定义属性
    String name; //名字
    int hp; // 血量
    int attack; // 攻击力

    // 定义构造方法
    public D4_TestPlants(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    // 定义成员方法
    public void fight(D4_TestZombies z){ // 传参：传入的僵尸对象的类型是僵尸类
        System.out.println(this.name + "正在打" + z.name + "僵尸");
        z.hp-= this.attack;
        System.out.println("僵尸的血量：" + z.hp + "\n");
    }
}
