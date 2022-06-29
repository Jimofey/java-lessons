package D4.testObject;

import java.util.Scanner;

public class LoginEquals {
    public static void main(String[] args) {
        String login = "admin";
        String pswd = "123";

        System.out.println("Please enter login name:");
        Scanner scn = new Scanner(System.in);
        String ulogin = scn.nextLine();
        System.out.println("Please enter password:");
        String upswd = scn.nextLine();

        if (login.equals(ulogin) && pswd.equals(upswd)){
            System.out.println("Login succeed");
        }else {
            System.out.println("Name or password error");
        }
    }
}
