package session_01.assessment;

import java.util.Scanner;

public class Assessment_03 {
        /*
    Write a Java program to ask user to enter password , ask user to re-enter password,
    user have only three attempts for re-enter password.

    Password should be not less than 3 character

        Input Data:
        Enter Your Password:
        Re-enter Your Password:

        ***************************

        Expected Output
        Password Mtached

 */
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Your Password");


                for(int i=1; i<=3 ; i++){
                        String password1 = scanner.nextLine();
                        System.out.println("Re-enter Your Password:");
                        String password2 = scanner.nextLine();

                        if ( password1.length()<=3){
                                System.out.println("Password should be not less than 3 character");
                        } else if (password1.equals(password2)) {
                                System.out.println(" Password Matched");
                                break;
                        }
                        else
                        {
                                System.out.println("incorrect password");
                        }
                }

        }
}
