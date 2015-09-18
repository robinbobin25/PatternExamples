package patterns.Adapter;

/**
 * Created by Antonina_Mykhailenko on 16.09.2015.
 */
public class Mongo_DB implements DB_Adapter {
    @Override
    public String adaptThisActionForMongoDB(String action) {
        /* some adaptation realization */
        return action;
    }

    @Override
    public String adaptThisActionForMySQLDB(String action) {
        //do nothing
        return null;
    }
}
