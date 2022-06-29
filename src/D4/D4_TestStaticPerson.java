package D4;

/**
 * static:静态的内容在内存中是唯一的，且各个对象之间共享
 * 应使用类名去访问静态的内容
 * 特点：
 *      1，数据共享；
 *      2，static的属性属于类，不属于对象
 *      3，静态的内容优先于对象产生
 *
 *  创建对象的过程：
 *      静态构造器 -> 通用构造器 -> 构造方法 -> 创建对象
 *
 *      1，由于创建对象的过程在静态内容加载完成之后，在静态方法和静态块里不能使用this
 *      2，成员的方法只能通过对象去使用
 *
 */

public class D4_TestStaticPerson {
    String name;
    static String country = "中国";
    String address;

    public D4_TestStaticPerson(String name, String address){
        this.name = name;
        // this.country = country;
        this.address = address;
    }

    public static void main(String[] args) {
        D4_TestStaticPerson p1 = new D4_TestStaticPerson("张三", "Beijing");
        D4_TestStaticPerson p2 = new D4_TestStaticPerson("李四", "Shanghai");

         /*
         修改其中的country
         对于对象共同的属性，可以用static定义在类中，该属性将存储与类中，而不是各个对象中
         如下替代至成员属性static中
          */
        // p1.country = "中华人民共和国";
        // p2.country = "中华人民共和国";
        D4_TestStaticPerson.country = "中华人民共和国"; // country 为类中的属性
    }

    /*
    创建对象的过程：
        静态构造器 -> 通用构造器 -> 构造方法 -> 创建对象
        举例：
     */
    // 通用构造器
    {
        System.out.println("这里是通用构造器");
    }
    // 静态构造器
    static {
        System.out.println("这里是静态构造器");
    }

}
