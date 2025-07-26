import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayOperations manager = new ArrayManager(5); // array of size 5

        // Insert values
        manager.insert(0, 10);
        manager.insert(1, 20);
        manager.insert(2, 30);

        // Try inserting at invalid index
        manager.insert(10, 40);

        // Display array
        manager.display();

        // Search for value
        System.out.print("Enter number to search: ");
        int num = scanner.nextInt();
        int index = manager.search(num);

        if (index != -1) {
            System.out.println("Found " + num + " at index " + index);
        } else {
            System.out.println(num + " not found in array.");
        }

        scanner.close();
    }
}
