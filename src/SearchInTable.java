import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchInTable {

    //-------------------------searchByName-------------------------------------------------
    public void searchByName(Connection conn,String tableName,String name){


        Statement statement;

        ResultSet rs=null;

        try {
            String query=String.format("select * from %s where name='%s'",tableName,name);

            statement=conn.createStatement();


            rs=statement.executeQuery(query);

            while (rs.next()) {
                System.out.print(rs.getString("empid")+" ");
                System.out.print(rs.getString("name") + " ");
                System.out.println(rs.getString("address") + " ");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    //-------------------------ById-------------------------------------------------
    public void searchById(Connection conn,String tableName,int empid){


        Statement statement;

        ResultSet rs=null;

        try {
            String query=String.format("select * from %s where empid='%s'",tableName,empid);
            statement=conn.createStatement();

            rs=statement.executeQuery(query);

            while (rs.next()) {
                System.out.print(rs.getString("empid")+" ");
                System.out.print(rs.getString("name") + " ");
                System.out.println(rs.getString("address") + " ");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }









}
