package SingleInheritance;

public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
/*⦁	Single Inheritance
Create two classes named Animal and Dog.
Animal with a single public method eat() that prints: "eating…"
Dog with a single public method bark() that prints: "barking…"
Dog should inherit from Animal.


Hints
Use the extends keyword to build a hierarchy*/