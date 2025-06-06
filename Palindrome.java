import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        int len = input.length();
        boolean isPalindrome = true;
        for(int i = 0,j=len-1; i<j;i++,j--){
            if(input.charAt(i) != input.charAt(j)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("The string is not a palindrome");
        }
        scanner.close();
    }
}
