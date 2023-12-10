package session_01.assessment;

import java.util.Scanner;

public class Assessment_02 {

    /*
    Write a Java program to ask user to enter password and user have only three attempts


    Password should be not less than 3 character

        Input Data:
        Enter Your Password:

        ***************************

        Expected Output
        Correct password

 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter password");
       for (int i =1; i<=3 ; i++) {
           String password = scanner.nextLine();

           if (password.length() < 3) {
               System.out.println("  Password should be not less than 3 character");

           } else {
               System.out.println("correct password");
               break;
           }
       }



    }
}
