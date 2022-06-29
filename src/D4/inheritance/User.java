/**
 * 继承：子类可以自动拥有父类中除了私有内容外的其他所有内容
 *  当x是一种y的时候，x就可以继承y的公共内容
 *      public class 类名 extends 父类名{
 *          xxx;
 *      }
 *  作用：简化代码的开发
 */

package D4.inheritance;

public class User {
    String word = "用户登陆"; // 用户登陆tips提示

    // 父类构造方法 - 先构造父类再构造子类
    public User(String word){
        System.out.println("调用父类构造方法");
        this.word = word;
    }

    public void login(){
        System.out.println("用户登陆");
    }

    //非公用的成员方法
    private void MobiLogin(){
        System.out.println("用户手机登陆");
    }
}
