package Java;
public class PersonExample {
    public static void main(String[] args) {
        // Створюємо об'єкт класу Person
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Викликаємо методи об'єктів
        person1.introduce();
        person2.introduce();
    }
}
