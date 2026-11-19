package conditions_methods_numberProblems.revision;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println("is Palindrome ? "+isPalindrome(13254));
    }
    
    public static boolean isPalindrome(int number) {

        int original = number;
        if(number < 0) return false;
        int palindrome = 0;
        while (number != 0) {
            int digit = number % 10;
            palindrome = palindrome * 10 + digit;
            number = number/10;
        }
        return palindrome == original;
    }
}
