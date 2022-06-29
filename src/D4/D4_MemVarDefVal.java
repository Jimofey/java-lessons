package D4;

/**
 * 成员变量初始值：
 *      基本数据类型：0
 *      引用数据类型：null，空，占位符
 *
 * 创建对象时会自动初始化成员变量，进行赋值
 */

public class D4_MemVarDefVal {
    // 基本数据类型
    byte b;
    short s;
    long l;
    int i;
    float f;
    double d;
    boolean bool;
    char c;

    // 引用数据类型
    String str;
    // Child child; // 自定义类

    public static void main(String[] args) {
        D4_MemVarDefVal defv = new D4_MemVarDefVal();
        System.out.println(defv.b); // 0
        System.out.println(defv.s); // 0
        System.out.println(defv.l); // 0
        System.out.println(defv.i); // 0
        System.out.println(defv.f); // 0.0
        System.out.println(defv.d); // 0.0
        System.out.println(defv.bool); // false
        System.out.println((int)defv.c); // 0
        System.out.println(defv.str); // null
        // System.out.println(defv.child); // null
    }
}
