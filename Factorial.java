import java.util.*;

public class Factorial{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        int factorial = 1;
        for(int i = n; i>0;i--){
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
        scanner.close();
    }
}