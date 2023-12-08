package session_02.inheritance;

public class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("I can swin");
    }

    public void display() {
        System.out.println("My name is " + name);
    }
}
