package session_02.encapsulation;

public class StudentNormalCase {

    String name = "Ahmed";
    int age = 25;
    String address = "Giza";

    public String studentInfo() {
        return ("Student name is: " + name + " , age is: " + address
                + " and Address is: " + address);
    }


    public static void main(String[] args) {
        StudentNormalCase studentNormalCase = new StudentNormalCase();
        System.out.println(studentNormalCase.studentInfo());
    }
}
