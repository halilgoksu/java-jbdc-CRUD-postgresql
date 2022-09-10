import java.sql.Connection;
import java.sql.Statement;

public class DeleteAllTable {

    public void deletAll(Connection conn,String tableName){

        Statement statement;



        try {
            String query=String.format("drop table %s",tableName);

            statement=conn.createStatement();


            statement.executeUpdate(query);

            System.out.println("You deleted all table");




        }catch (Exception e){
            System.out.println(e);
        }
    }
}
