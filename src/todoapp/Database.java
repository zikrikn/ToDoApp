package todoapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:db\\todoapp.db");
            System.out.println("Database Sukses Dibuat");

            Statement statement = connection.createStatement();

            String createScriptSQL = "CREATE TABLE IF NOT EXISTS Tugas" + 
            "(TugasID 		TEXT PRIMARY KEY NOT NULL UNIQUE, " +
            "NamaTugas 		TEXT NOT NULL, " + 
            "NamaProject 	TEXT NOT NULL, " + 
            "Status 		TEXT NOT NULL, " +
            "DataCreated 	TEXT NOT NULL, " + 
            "DueDate 		TEXT NOT NULL)";

            //CREATING TABLE
            statement.execute(createScriptSQL);

            String insertScriptSQL = "";

            //CREATING DATA
            statement.execute(insertScriptSQL);

            //UPDATE DATA

            //DELETE DATA

            //READ DATA
            
        } catch (SQLException sqlException) {
            // TODO: handle exception
            System.out.println(sqlException.getMessage());
        }
    }
    
}
