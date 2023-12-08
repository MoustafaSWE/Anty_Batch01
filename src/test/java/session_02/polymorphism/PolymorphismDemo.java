package session_02.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shapes shapes;
        shapes = new Shapes();
        shapes.area();

        shapes = new Circle();
        shapes.area();

        shapes = new Triangle();
        shapes.area();

    }
}
