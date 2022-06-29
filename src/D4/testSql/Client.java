/**
 * 【题目】类图地址：https://www.processon.com/view/link/5c92012fe4b01e76978642b1
 */

package D4.testSql;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Please select the SQL: (1, MySQL; 2, OracleSQL");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        IDAO sql; //需要在判断体外声明，声明一个 IDAO 类型的变量但暂不赋值对象
        if (n == 1){
            sql = new MySqlDao();
        }else {
            sql = new OracleSqlDao();
        }
        sql.connect();
        sql.add();
        sql.del();
        sql.upd();
        sql.sel();
    }
}
