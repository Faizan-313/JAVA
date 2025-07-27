import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new SavingsAccount(1000); // initial balance

        try {
            System.out.print("Enter deposit amount: ");
            double depositAmount = Double.parseDouble(scanner.nextLine());
            account.deposit(depositAmount);

            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = Double.parseDouble(scanner.nextLine());
            account.withdraw(withdrawAmount);

            System.out.println("Current balance: " + account.getBalance());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input. Please enter numbers only.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Transaction completed.");
        }
    }
}
