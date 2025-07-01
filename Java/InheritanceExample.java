package Java;
public class InheritanceExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic");
        genericAnimal.speak();  // The animal makes a sound.

        Dog dog = new Dog("Buddy");
        dog.speak();  // Buddy says: Woof!
    }
}
