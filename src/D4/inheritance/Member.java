/**
 * Super关键字：表示和获取父类中的内容
 *      this：表示自己类中的内容
 *      super：表示父类中的内容
 *      用super和this来区分父类和子类中重名的内容
 *
 *      1，每一个子类对象里都内含父类对象，创建子类对象的过程，必须先创建父类的对象
 *      2，可以调用父类的构造方法，必须写在子类构造方法的第一行，如果父类构造有参数必须传入
 *      3，如果父类构造无参数，可不写super();
 *
 * 继承中方法的重写：又称为方法的覆盖，子类对父类提供对方法进行重新定义
 *      语法：子类和父类对该方法的声明完全一致
 */

package D4.inheritance;

public class Member extends User{ // Member <- User
    String word = "会员登陆";

    // 子类构造方法
    public Member(){
        super("请用户登陆"); // 还原程序，默认先调用父类的构造方法
        // 对super的调用只能在构造的第一行
        // 如果父类的构造无参数传入(默认的情况），可以不写super();
        System.out.println("调用子类构造方法");
    }

    // 父类的Login方法的重写
    public void login(){
        // 对父类方法的重写又称为半盖
        super.login(); //也可以在重写中继续调用父类的方法
        System.out.println("会员登陆");
    }

    public void NumberLogin(){
        System.out.println("会员号登陆");
    }

    // Super关键字
    public void loginTip(){
        System.out.println("登陆提示：" + this.word);
        System.out.println("登陆提示：" + super.word);
    }

    public static void main(String[] args) {
        Member member = new Member(); // 创建子类对象时，会先创建父类的对象，再创建子类
        member.login();
        member.NumberLogin();
        // member.MobiLogin(); // private 私有的成员方法不能被子类调用

        // Super关键字
        member.loginTip();
    }
}
