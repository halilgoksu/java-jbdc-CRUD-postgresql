import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    public void createTable(Connection conn, String table_name){
        Statement statement;
        try {
            String query="create table "+table_name+"(empid SERIAL,name varchar(50),address varchar(50),primary key(empid));";

            statement=conn.createStatement();

            statement.executeUpdate(query);

            System.out.println("Tablo olusturuldu");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
