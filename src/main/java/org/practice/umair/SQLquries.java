package org.practice.umair;

public class SQLquries {
    public static String addStudent = "INSERT INTO students VALUES ( ? , ? , ? )";
    public static String updateStudent = "UPDATE students SET marks = ? WHERE name = ?";
    public static String deleteStudent = "DELETE FROM students WHERE name = ?";
    public static String getAllStudent = "SELECT * FROM students";
}
