package org.practice.umair;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nWELLCOME TO DATABASE MANAGEMENT OF STUDENTS SELECT FROM THE FOLLOWING TO PERFORM OPERATION\n");
        System.out.println("1. Add Student  2. Updated Student  3. Delete Student  4. Get All Students ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the choice : ");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("WELLCOME TO ADDING STUDENT.");
                System.out.print("ENTER THE ID : ");
                int id = input.nextInt();
                System.out.print("ENTER THE NAME : ");
                String name = input.next();
                System.out.print("ENTER THE MARKS : ");
                int marks = input.nextInt();
                Students newStudent = new Students(id , name , marks);
                DBoperations.addingStudent(newStudent);
                break;
            case 2:
                System.out.println("WELLCOME TO UPDATING STUDENT");
                break;
            case 3:
                System.out.println("WELLCOME TO DELETE A STUDENT.");
                break;
            case 4:
                System.out.println("WELLCOME TO GET ALL STUDENTS");
                break;
            default:
                System.out.println("PLEASE TRY AGAIN AND GIVE A VALID NUMBER FROM 1 TO 4.");
        }

    }
}

