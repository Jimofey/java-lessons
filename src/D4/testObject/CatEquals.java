/**
 * equals 和 ==
 *  equals:
 *      1，equals可以重写
 *      2，字符串的判断一定要用equals来写，如用户登录验证
 *
 *  ==:
 *      1，默认用于判断两个对象的内存地址是否一致
 *      2，对于String字符串，Java也会判断相等，是因为节省内存空间考虑，相同字符串会引用同一内存地址
 */

package D4.testObject;

public class CatEquals {
    String name;
    String color;

    public CatEquals(String name, String color){
        this.name = name;
        this.color = color;
    }

    // 2，对Object的equals方法可以按自己的需求重写
    public boolean equals(CatEquals cat){
        if (this.color == cat.color){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        CatEquals cat1 = new CatEquals("小花","红色");
        CatEquals cat2 = new CatEquals("小花","红色");

        System.out.println(cat1 == cat2); // false
        // "=="默认判断的是两个对象的内存地址是否一致，一般用在基本数据类型上，不用在引用数据类型上（字符串String除外）

        // 1，equals 调用的是根调用Object的方法
        // System.out.println(cat1.equals(cat2)); // false
        // 3，按自己需求重写equals后：
        System.out.println(cat1.equals(cat2)); // true

        /*
        字符串的判断，equal和==比较:
            对于String字符串，Java也会判断相等，是因为节省内存空间考虑，相同字符串会引用同一内存地址
         */
        String str1 = "猫";
        String str2 = "猫";
        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        String str3 = new String("猫"); // new 创建了新的对象
        String str4 = new String("猫"); // new 创建了新的对象
        System.out.println(str3 == str4); // false，两个对象的内存地址不一样
        /*
         Str1 -> "猫"
         Str2 -> "猫"
         Str3 -> 字符串对象1地址 -> "猫"
         Str4 -> 字符串对象2地址 -> "猫"
         */
        System.out.println(str3.equals(str4)); // true，两个对象的内容是一致的

    }
}
