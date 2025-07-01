package Java;
public class Start {
    public static void main(String[] args) {
        byte age = 25;
        short year = 2024;
        int salary = 50000;
        long stars = 9876543210L;

        float price = 10.99f;
        double pi = 3.14159;

        char grade = 'A';
        boolean isJavaFun = true;

        String name = "Alice";
        int[] scores = {90, 85, 100};

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Salary: " + salary);
        System.out.println("Stars in galaxy: " + stars);
        System.out.println("Price: $" + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Java is fun? " + isJavaFun);

        // Вивід елементів масиву scores
        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println(); // для переносу рядка
    }
}
