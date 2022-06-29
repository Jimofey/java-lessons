package D4.testSql;

public class MySqlDao extends abstractDAO{
    @Override
    public void connect() {
        System.out.println("MySQL connecting...");
    }
}
