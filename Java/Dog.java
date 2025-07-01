package Java;
public class Dog extends Animal {

    public Dog(String name) {
        super(name);  // виклик конструктора базового класу
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }
}
