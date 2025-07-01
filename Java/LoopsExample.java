package Java;
public class LoopsExample {
    public static void main(String[] args) {

        // FOR loop – від 1 до 5
        System.out.println("FOR loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // WHILE loop – рахуємо вниз від 5 до 1
        System.out.println("\nWHILE loop:");
        int j = 5;
        while (j > 0) {
            System.out.println("Countdown: " + j);
            j--;
        }

        // DO-WHILE loop – виконується хоча б один раз
        System.out.println("\nDO-WHILE loop:");
        int k = 1;
        do {
            System.out.println("This will print at least once. k = " + k);
            k++;
        } while (k <= 3);

        // FOR-each loop – для масиву
        System.out.println("\nFOR-EACH loop:");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
