import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ConnectDatabase connectDatabaseUlan =new ConnectDatabase();
        CreateTable create =new CreateTable();
        InsertTable insertBroo=new InsertTable();
        ReadFromTable readBroo=new ReadFromTable();
        UpdateTable updateTable=new UpdateTable();
        SearchInTable searchBroo=new SearchInTable();
        DeleteFromTable deleteDude=new DeleteFromTable();
        DeleteAllTable deleteAll=new DeleteAllTable();


       Connection conn= connectDatabaseUlan.connection_to_db("databaseName","dabaseUserNaem","yourdatabasepassword");


        //Create Table
      create.createTable(conn,"employee");


        //insert Table
        insertBroo.insert(conn,"employee","halil","santilo");


        //Read
        readBroo.read_data(conn,"employee");


        //Update
        updateTable.updateTable(conn,"employee","ff","Hagi");



        //SEARCH

        //by name
       searchBroo.searchByName(conn,"employee","Hagi");

        //by id
        searchBroo.searchById(conn,"employee",1);



        //DELETE by name
        deleteDude.deletFromTable(conn,"employee","ss");

        //Delete All table
       deleteAll.deletAll(conn,"employee");


    }
}
