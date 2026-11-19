package conditions_methods_numberProblems.revision;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reversed number are " + reverseNumber(0));
    }

    public static int reverseNumber(int number) {

        int reverse = 0;
        while(number != 0){
            int digit =  number % 10;
            reverse = reverse *10 + digit;
            number = number /10;
        }
        return reverse;
    }
}
