package D4.authority;

public class TestPerson {

    // 访问权限对照：
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Public: " + p.pub);
        System.out.println("Default: " + p.def);
        // System.out.println("Private: " + p.pri); // private 私有的成员属性不能跨类访问
        // 同理，跨包之后，default也不能访问

        //getter and setter
        Person p_getset = new Person();
        p_getset.setName("John");
        p_getset.setAge(18);

        System.out.println("姓名：" + p_getset.getName());
        System.out.println("年龄：" + p_getset.getAge());
    }
}
