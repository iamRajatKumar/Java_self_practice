package conditions_methods_numberProblems;

public class StrongNum {
    public static void main(String[] args) {
        System.out.println("Is Strong number ? : " + isStrongNumber(105));
    }

    public static boolean isStrongNumber(int number) {

        // Write your logic
        int originalNum = number;
        if (number <= 0)
            return false;
        if (number == 1)
            return true;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            int fact = 1;
            while (digit > 0) {
                fact *= digit;
                digit--;
            }
            sum += fact;
            number = number/10;
        }
        return sum == originalNum;
    }
}

/*
 * A Strong Number is a number equal to the sum of the factorials of its
 * individual digits.
 * For example, consider 145.
 * Its digits are 1, 4 and 5.
 * 1!+4!+5!=1+24+120=145
 * Therefore, 145 is a Strong Number.
 */