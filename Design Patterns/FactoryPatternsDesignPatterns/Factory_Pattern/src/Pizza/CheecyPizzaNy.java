package Pizza;

public class CheecyPizzaNy extends Pizza{

    public CheecyPizzaNy() {
        System.out.println("cheesy pizza new york");
    }

    @Override
    void getName() {
        System.out.println("cheesy pizza from new york");
    }
}
