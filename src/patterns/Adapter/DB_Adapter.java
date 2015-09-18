package patterns.Adapter;

/**
 * Created by Antonina_Mykhailenko on 16.09.2015.
 */
interface DB_Adapter {
    String adaptThisActionForMongoDB(String action);
    String adaptThisActionForMySQLDB(String action);
}
