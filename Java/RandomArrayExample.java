package Java;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayExample {
    public static void main(String[] args) {

        // Розмір масиву
        int size = 5;

        // Спосіб 1: Використання java.util.Random
        Random random = new Random();
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = random.nextInt(100); // випадкове число від 0 до 99
        }
        System.out.println("Array filled with java.util.Random:");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Спосіб 2: Використання ThreadLocalRandom (рекомендується в сучасних додатках)
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array2[i] = ThreadLocalRandom.current().nextInt(100); // від 0 до 99
        }
        System.out.println("Array filled with ThreadLocalRandom:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
