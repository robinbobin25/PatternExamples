package patterns.Adapter;

/**
 * Created by Antonina_Mykhailenko on 18.09.2015.
 */
public class WorkWithDatabase {

    public void run(String DB_name, String action){
        if(DB_name.equals("mysql")){
            System.out.println(DB_name + " was adapted to " + action);
        } else if(DB_name.equals("mongo")){
            System.out.println(DB_name + " was adapted to " + action);
        } else {
            System.out.println("--> This DB not supported.");
        }
    }
}
