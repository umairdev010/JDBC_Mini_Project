package org.practice.umair;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    public static void dbConnect(){

        String url = "jdbc:postgresql://localhost:5432/testing";
        String user = "postgres";
        String password = "00987";
        try {

            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url , user , password);

            System.out.println("\n DATABASE connected \n");


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
