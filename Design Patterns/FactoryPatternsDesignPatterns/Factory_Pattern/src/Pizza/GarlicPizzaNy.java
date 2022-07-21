package Pizza;

public class GarlicPizzaNy  extends  Pizza{

    public GarlicPizzaNy() {
        System.out.println("garlic pizza new york");
    }
    // the varible methods are overidden here
    @Override
    void getName() {
        System.out.println("garlic new york pizza");
    }

}
