import java.sql.Connection;
import java.sql.Statement;

public class DeleteFromTable {

    public void deletFromTable(Connection conn,String tableName,String name){

        Statement statement;



        try {
            String query=String.format("delete from %s where name='%s'",tableName,name);

            statement=conn.createStatement();


            statement.executeUpdate(query);

            System.out.println("delete  successful ");




        }catch (Exception e){
            System.out.println(e);
        }
    }
}
