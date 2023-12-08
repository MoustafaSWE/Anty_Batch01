package session_02.inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Fish fish = new Fish();

        cat.name = "Meow";
        cat.display();
        cat.eat();
        cat.move();

        fish.name = "Nemo";
        fish.display();
        fish.eat();
        fish.move();
    }
}
