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
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("PLEASE TRY AGAIN AND GIVE A VALID NUMBER FROM 1 TO 4.");
        }

    }
}

