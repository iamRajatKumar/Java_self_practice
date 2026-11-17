package conditions_methods_numberProblems;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Perfect number :" + perfectNumber(1));
    }

    private static boolean perfectNumber(int number) {
        if (number <=1)
            return false;
        int sum = 0;
        for (int i = 1; i <number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
