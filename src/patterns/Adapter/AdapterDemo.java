package patterns.Adapter;

/**
 * Created by Antonina_Mykhailenko on 18.09.2015.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        WorkWithDatabase workWithDatabase = new WorkWithDatabase();
        MySQL_DB mySQL_db = new MySQL_DB();
        Mongo_DB mongo_db = new Mongo_DB();

        workWithDatabase.run("mysql", mySQL_db.adaptThisActionForMySQLDB("create"));
        workWithDatabase.run("mysql", mySQL_db.adaptThisActionForMySQLDB("read"));
        workWithDatabase.run("mysql", mySQL_db.adaptThisActionForMySQLDB("update"));
        workWithDatabase.run("mysql", mySQL_db.adaptThisActionForMySQLDB("delete"));

        workWithDatabase.run("mongo", mongo_db.adaptThisActionForMongoDB("create"));
        workWithDatabase.run("mongo", mongo_db.adaptThisActionForMongoDB("read"));
        workWithDatabase.run("mongo", mongo_db.adaptThisActionForMongoDB("update"));
        workWithDatabase.run("mongo", mongo_db.adaptThisActionForMongoDB("delete"));
    }
}
