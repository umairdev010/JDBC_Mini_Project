package org.practice.umair;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    public static Connection dbConnect(){

        String url = "jdbc:postgresql://localhost:5432/testing";
        String user = "postgres";
        String password = "00987";
        try {

            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url , user , password);

            System.out.println("\nDATABASE connected : 'SUCCESSFULLY'");

            return connection;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("There is a error in DB connection " + e);
            return null;
        }

    }


}
