package D4.authority;

/**
 * 访问权限：
 *  1，public 公共的，所有人都能访问
 *  2，default 包访问权限，在自己的包内可以随意访问,一般情况下默认就是default
 *  3，private 私有的：
 *      成员变量一般用private来声明，保护成员变量不被胡乱赋值
 *
 * setter and getter:
 *      setter:主要是给成员变量赋值，做一定的保护，比如筛除不符合逻辑的赋值
 *      getter:从成员变量中获取数据（因private声明无法直接获取值）
 *  空白位置 -> 右键 -> generate -> getter and setter -> 选择需要的属性 -> OK
 *
 */

public class Person {
    public String pub = "public";
    private String pri = "private";
    String def = "default"; // == default String def = "default";

    // getter and setter
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Setter可对用户对私有变量对输入做保护，如年龄输入的防错
        if (age < 0){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    // 访问权限对照：
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Public: " + p.pub);
        System.out.println("Default: " + p.def);
        System.out.println("Private: " + p.pri);
    }
}
