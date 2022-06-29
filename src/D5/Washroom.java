package D5;

public class Washroom {
    String gender;

    public Washroom(String gender) {
        this.gender = gender;
    }

    public void enter(Person p) throws GenderException{ // 需要表示有可能有GenderException抛出
        if (p.gender.equals(this.gender)){
            System.out.println("允许进入");
        } else {
            throw new GenderException("非法闯入"); // 传入GenderException的构造方法
            // == throw new Exception("非法闯入");
        }
    }
}
