package session_01.assessment;

import java.util.Scanner;

public class Assessment_01 {

    /*
    Write a Java program to compare two numbers.
        Input Data:
        Input first integer: 25
        Input second integer: 39

        ***************************

        Expected Output

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre your first integer");
        int firstInteger = scanner.nextInt();
        System.out.println("Entre your second integer");
        int secondInteger = scanner.nextInt();
        if (firstInteger > secondInteger){
            System.out.println("firstInteger is bigger");
        } else if (firstInteger<secondInteger) {
                    System.out.println("second integer is bigger");
        }
        else {
            System.out.println("firstInteger is equal second integer ");
            System.out.println(firstInteger + "=" + secondInteger);

        }



    }
}
