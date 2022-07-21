public class Main {

        public static void main(String[] args) {
            DbConnection db1;

            // refers to the only object of Database
            db1= DbConnection.getInstance();

            db1.getConnection();
        }

}
