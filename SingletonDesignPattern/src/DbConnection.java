public class DbConnection {

    private static DbConnection dbObject;

    private DbConnection() {
    }

    public static DbConnection getInstance() {

        // create object if it's not already created
        if (dbObject == null) {
            dbObject = new DbConnection();
        }

        // returns the singleton object
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }
}

