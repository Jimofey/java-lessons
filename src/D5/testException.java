/**
 * 异常：
 *  link: https://www.processon.com/view/link/5c920c28e4b0ab74ecdf9dc7
 *  产生的异常尽可能处理，少向外抛出
 *
 *  1，异常的处理：
 *      抛异常 - 产生异常对象
 *      捕获异常 - 默认JavaVirtualMachine来处理，程序会中断，并打印错误信息
 *
 *  2，异常的分类：
 *      RuntimeException 运行时异常
 *      其他Exception 编译时异常
 *      Error: 系统级错误
 *
 * 异常处理：
 *      （代码行内）
 *      try
 *          需要运行的代码
 *      catch (Exception e)
 *          e.printStackTrace(); 打印错误信息
 *      finally
 *          收尾工作
 *
 * 抛异常：
 *      (调用关系时）
 *      方法行 + throws Exception 表示方法可能向外抛出异常对象Exception
 *      throw new Exception(); 向外抛出异常
 *
 */

package D5;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class testException {

    // throws, throw，抛出的异常由调用者处理
    // 调用者处理
    public static void fileRead() throws Exception{ // 表示当前方法会抛出Exception这样的错误
            InputStream is = new FileInputStream(new File("路径名称")); // 举例：读取文件需要准备的流
    }

    public static void cal(int a, int b) throws Exception{ // 表示当前方法会抛出Exception这样的错误
        if (b == 0){
            throw new Exception("除数不能为0"); // 创建Exception对象
        } else {
            System.out.println(a / b);
        }
    }

    public static void main(String[] args) throws Exception {

        // try...catch...finally
        try{
            System.out.println(1/0);
        } catch (Exception e){
            e.printStackTrace(); // 打印程序错误信息
            // System.out.println("系统出错"); // 客户信息
        } finally { // 一般做收尾工作，无异常也会执行
            // 处理方式，如 关闭文件
        }

        fileRead();
        // Option + Enter，方案1 - 在方法名处声明当前方法可能会抛出错误
        // Option + Enter，方案2 - 用try...catch环绕调用，如上

        cal(2,1);

    }
}
