
public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Is Palindrome? : " + isPalindrome("abca"));
    }

    // using two pointers approach
    private static Boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() -1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    // using reversed string
    // String original = str;
    // String reverse = "";
    // int len = str.length() -1;
    // for(int i = len; i>= 0; i--){
    // char c = str.charAt(i);
    // reverse += c;
    // }
    // return original.equals(reverse);
    }
}
