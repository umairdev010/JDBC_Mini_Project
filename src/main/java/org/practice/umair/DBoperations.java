package org.practice.umair;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public static void updateStudent(String name, int marks){
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

    public static void deleteStudent(String name){
        Connection connection = ConnectDB.dbConnect();
        try {
            PreparedStatement statement = connection.prepareStatement(SQLquries.deleteStudent);
            statement.setString(1,name);
            statement.executeUpdate();
            System.out.println("STUDENT HAS BEEN DELETED.");
        } catch (Exception e) {
            System.out.println("ERROR IS OCCURRED WHILE DELETING STUDENT : " + e);
        }
    }

    public static ArrayList<Students> getAllStudnets(){
        Connection connection = ConnectDB.dbConnect();
        try {
            PreparedStatement statement = connection.prepareStatement(SQLquries.getAllStudent);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Students> studentsList = new ArrayList<Students>();
            while (resultSet.next()){
                studentsList.add(new Students(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("marks") ));
            }
            return studentsList;
        } catch (Exception e) {
            System.out.println("ERROR IS OCCURRED WHILE GETTING ALL STUDENTS : " + e);
            return null;
        }
    }

}
