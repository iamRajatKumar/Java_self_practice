package conditions_methods_numberProblems;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Perfect number :" + perfectNumber(-6));
    }

    private static boolean perfectNumber(int number) {
        int original = number;
        if (number < 0)
            return false;
        if (number == 0 || number == 1)
            return true;
        int sum = 0;
        for (int i = 1; i <number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == original;
    }
}
