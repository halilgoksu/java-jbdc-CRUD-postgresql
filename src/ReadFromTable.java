import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadFromTable {

    public void read_data(Connection conn,String table_name){

        Statement statement;

        ResultSet rs=null;

        try {
            String query=String.format("select * from %s",table_name);

            statement=conn.createStatement();


            rs=statement.executeQuery(query);

            while (rs.next()){
                System.out.print(rs.getString("empid")+" ");
                System.out.print(rs.getString("name")+" ");
                System.out.println(rs.getString("Address")+" ");


            }


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
