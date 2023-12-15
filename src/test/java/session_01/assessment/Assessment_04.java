package session_01.assessment;

import java.util.Scanner;

public class












Assessment_04 {

    /*
     Write a Java method to find the smallest number among three numbers.
        Test Data:
        Input the first number: 25
        Input the Second number: 37
        Input the third number: 29

        ***************************

        Expected Output:

        The smallest value is 25.0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number");
      for (int i=0; i<3 ; i++ )
      {
          int firstNumber = scanner.nextInt();
        System.out.println("Input the Second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Input the third number");
        int thirdNumber = scanner.nextInt();
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("The smallest value is" + firstNumber);
        }
        else  if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            System.out.println("The smallest value is" + secondNumber);
        }
        else {
            System.out.println("The smallest value is:" +" "+ thirdNumber);
        }

      }

    }
}
