package D4.testSql;

public abstract class abstractDAO implements IDAO{
    @Override
    public void add() {
        System.out.println("Add");
    }

    @Override
    public void del() {
        System.out.println("Delete");
    }

    @Override
    public void upd() {
        System.out.println("Update");
    }

    @Override
    public void sel() {
        System.out.println("Select");
    }
}
