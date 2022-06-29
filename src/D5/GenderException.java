/**
 * 自定义异常处理需要继承Exception 或 RuntimeException
 */

package D5;

public class GenderException extends Exception{
    // 构造方法
    public GenderException(String msg){
        super(msg);
        // Exception("String"); RuntimeException("String");
    }
}
