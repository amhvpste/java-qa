package Java;
public class Person {
    // Поля (атрибути)
    String name;
    int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод для виводу інформації
    public void introduce() {
        System.out.println("Hi, my name is " + name + ", and I am " + age + " years old.");
    }
}
