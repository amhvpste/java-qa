public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("How many test questions do you want to enter? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        String[] questions = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter question #" + (i + 1) + ": ");
            questions[i] = scanner.nextLine();
        }

        System.out.println("\nYou entered the following questions:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ") " + questions[i]);
        }

        scanner.close();
    }
}
