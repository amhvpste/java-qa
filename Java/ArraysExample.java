package Java;
public class ArraysExample {
    public static void main(String[] args) {

        // 1. Одновимірний масив (цілі числа)
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("One-dimensional array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }

        // 2. Масив рядків
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("\nString array:");
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // 3. Двовимірний масив (таблиця чисел)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("\nTwo-dimensional array:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); // перехід на новий рядок
        }

        // 4. Зміна значення в масиві
        numbers[0] = 99;
        System.out.println("\nChanged first element in 'numbers': " + numbers[0]);

        // 5. Довжина масиву
        System.out.println("\nLength of 'names' array: " + names.length);
    }
}
