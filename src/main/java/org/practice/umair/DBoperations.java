package org.practice.umair;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBoperations {

    public static void addingStudent(Students student){
        Connection connection = ConnectDB.dbConnect();
        try {
            PreparedStatement statement = connection.prepareStatement(SQLquries.addStudent);
            statement.setInt(1,student.getId());
            statement.setString(2,student.getName());
            statement.setInt(3,student.getMarks());
            int row = statement.executeUpdate();
            System.out.println("STUDENT ADDED " + row);
        } catch (SQLException e) {
            System.out.println("There is a error in creating new student : " + e);
        }

    }

    public static void updateStudetn(String name, int marks){
        Connection connection = ConnectDB.dbConnect();
        try {
            PreparedStatement statement = connection.prepareStatement(SQLquries.updateStudent);
            statement.setInt(1,marks);
            statement.setString(2,name);
            int row = statement.executeUpdate();
            System.out.println("STUDENT UPDATED " + row);
        } catch (Exception e) {
            System.out.println("ERROR IS OCCURRED WHILE UPDATING STUDENT : " + e);
        }
    }

}
