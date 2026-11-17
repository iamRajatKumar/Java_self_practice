package conditions_methods_numberProblems;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Perfect number :" + perfectNumber(28));
    }

    private static boolean perfectNumber(int number) {

        if (number <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i <= number / i; i++) {

            // Check whether i divides number
            if (number % i == 0) {
                sum += i;
                // Add the paired divisor only if different
                if (i != number / i) {
                    sum += number / i;
                }
            }
            
        }
        return sum == number;
    }
    // private static boolean perfectNumber(int number) {
    // if (number <=1)
    // return false;
    // int sum = 0;
    // for (int i = 1; i <number; i++) {
    // if (number % i == 0) {
    // sum += i;
    // }
    // }
    // return sum == number;
    // }
}
