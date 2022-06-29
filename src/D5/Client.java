/**
 * 自定义异常处理：
 *      1，尽量少使用自定义异常处理，避免维护麻烦
 *      2，自定义异常处理需要继承Exception 或 RuntimeException
 */

package D5;

public class Client {
    public static void main(String[] args) throws GenderException {
        Person p1 = new Person("John", "男");
        Person p2 = new Person("Alice", "女");
        Washroom room = new Washroom("男");

        // room 有 GenderException抛出，程序入口需要添加throws
        room.enter(p1); // 允许进入
        room.enter(p2); // Exception:非法闯入

    }
}
