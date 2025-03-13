import java.util.Scanner;

public class PalindromeString {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0, right = str.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");

        scanner.close();
    }
}


