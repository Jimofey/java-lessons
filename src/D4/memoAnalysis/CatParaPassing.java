/**
 * 2，参数传递的问题：
 *      1，值传递：把变量的值作为参数进行传递，Java使用的全部都是值传递
 *      2，引用传递：直接把变量作为参数进行传递
 *
 *  用堆栈分析可区分是否更新对象属性或新建了属性
 *      类类型变量 -> 对象内存地址 -> 对象本身
 *      new将创建新的对象，占用新的内存地址
 */

package D4.memoAnalysis;

public class CatParaPassing {
    String name;

    public CatParaPassing(String name) {
        this.name = name;
    }

    // 1，参数传递的问题 - 变量
    public static void change(int a){
        a = 20;
        // System.out.println(a);
    }

    // 2，参数传递的问题 - 对象
    public static void changeCat(CatParaPassing cat){
        // cat = new CatParaPassing("橘猫"); // 2A3B
        // 1，以上运行完后，堆内新建的"橘猫"和 changeCat.cat的内存地址对应，均被回收

        cat.name = "梨花猫";
        // 2，因ChangeCat.cat的指向一直为1A2B且修改了属性
        // ChangeCat资源回收后1A2B有其他变量指向，不会被回收
    }

    public static void main(String[] args) {
        // 1，参数传递的问题 - 变量
        int a = 10; // 局部变量
        // int a 和 change int a 在栈内并非同一值
        change(a); // 方法执行完后会资源回收其变量及值
        System.out.println(a); // 10

        // 2，参数传递的问题 - 对象
        CatParaPassing cat = new CatParaPassing("蓝猫"); //1A2B
        changeCat(cat);
        System.out.println(cat.name); // 1, 蓝猫；2，狸花猫

    }
}
