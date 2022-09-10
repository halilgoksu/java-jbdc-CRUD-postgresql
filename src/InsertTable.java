import java.sql.Connection;
import java.sql.Statement;

public class InsertTable {

    public void insert(Connection conn,String table_name, String name,String address){

        Statement statement;
        try {
            String query=String.format("insert into %s(name,address)values('%s','%s');",table_name,name,address);

            statement=conn.createStatement();

            statement.executeUpdate(query);
            System.out.println("Tablo yeni elemnalar eklendi ");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
