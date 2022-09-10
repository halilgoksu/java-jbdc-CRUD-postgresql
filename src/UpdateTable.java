import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateTable {

    public void updateTable(Connection conn,String tableName,String oldName,String newName){

        Statement statement;



        try {
            String query=String.format("update  %s set name='%s' where name='%s'",tableName,newName,oldName);

            statement=conn.createStatement();


            statement.executeUpdate(query);

            System.out.println("update succefull ");




        }catch (Exception e){
            System.out.println(e);
        }
    }
}
