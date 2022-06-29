/**
 * 包和包的导入
 * 包：文件夹
 * 在代码中需要写：
 *      package + 包名
 * 不同文件夹下的类需要先import:
 *      import 包名.类名
 *      import package.* 表示导入包内的所有类
 * 不需要导入包的情况：
 *      在同一个包里
 *      java.lang下的所有内容（String，System.out.println())
 */

package D4.PlantsVSZombies; // 包的声明：当前类从属于PlantsVSZombies这个包下

/**
 * 【题目 - 植物大战僵尸】
 *  定义三个类：
 *      1，植物：属性 - 名字，血量，攻击力，动作 - 打僵尸
 *      2，僵尸：属性 - 名字，血量，攻击力，动作 - 吃植物
 *      3，植物大战僵尸：创建植物和僵尸的对象，并调用"打僵尸"或"吃植物"的动作
 */

public class D4_TestPlantsVSZombies {
    public static void main(String[] args) {
        // 创建僵尸和植物
        D4_TestZombies z1 = new D4_TestZombies("铁桶",100,5);
        D4_TestPlants p1 = new D4_TestPlants("豌豆", 100, 10);

        //调用 - 植物打僵尸
        p1.fight(z1);
        //调用 - 植物打僵尸
        p1.fight(z1);
        //调用 - 僵尸吃植物
        z1.eat(p1);
    }
}
