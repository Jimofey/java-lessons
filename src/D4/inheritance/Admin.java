package D4.inheritance;

public class Admin extends Member { // Admin <- Member <- User，可嵌套父类内容

    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.login();
        admin.NumberLogin();
    }
}
