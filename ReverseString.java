import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        int len = input.length();
        String reversed = "";
        for(int i = len -1; i>=0;i--){
            reversed += input.charAt(i);
        }
        scanner.close();
        System.out.println("Reversed string is: " + reversed);
    }
}
