package session_02.encapsulation;

public class StudentsUsingConstructor {

    String name;
    int age;
    String address;

    public StudentsUsingConstructor(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress() {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return ("Student name is: " + this.getName() + " , age is: " + this.getAge()
                + " and Address is: " + this.getAddress());
    }

    public static void main(String[] args) {
        StudentsUsingConstructor john = new StudentsUsingConstructor("john", 25, "Cairo");
        StudentsUsingConstructor mike = new StudentsUsingConstructor("Mike", 24, "Giza");


        System.out.println(john.toString());
        System.out.println(mike.toString());
    }
}
