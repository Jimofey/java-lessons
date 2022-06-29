/**
 * 1，toString()：对一个对象的字符串的表示形式：包+类@内存地址
 * 官方推荐重写这个方法
 *
 * 2，instanceof：判断一个对象是否属于一个类
 *      用法：对象 instanceof 类
 *      限制：进行比较的对象和类需要在一个父类下
 */

package D4.testObject;

public class testtoString {
    String name;
    String fclass;

    public testtoString(String name, String fclass){
        this.name = name;
        this.fclass = fclass;
    }

    // 2，重写toString方法，右键 -> 生成 -> idea默认即可
    @Override
    public String toString() {
        return "testtoString{" +
                "name='" + name + '\'' +
                ", fclass='" + fclass + '\'' +
                '}';
    }

    public static void main(String[] args) {
        testtoString ts = new testtoString("toString","Object");
        System.out.println(ts.toString()); // 1，默认toString()方法返回 包+类@内存地址
        // 3，重写toString方法后运行

        // instanceof
        if (ts instanceof testtoString){ // 该判断需要基于对象和类在同一父类下
            System.out.println("同一类");
        } else {
            System.out.println("不同类");
        }

    }
}
