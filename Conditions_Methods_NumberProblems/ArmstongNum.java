package conditions_methods_numberProblems;

public class ArmstongNum {

    public static void main(String[] args) {
        System.out.println("Armstrong num : " + isArmstrong(9474));
    }

    public static boolean isArmstrong(int n) {

        if (n < 0) {
            return false;
        }

        int originalNum = n;
        int temp = n;

        // Step 1: Count digits
        int digitCount = 0;

        do {
            digitCount++;
            temp = temp / 10;
        } while (temp != 0);

        // Step 2: Extract digits
        temp = n;
        int sum = 0;

        do {
            int digit = temp % 10;

            // Calculate digit raised to digitCount
            // using a loop, not Math.pow()
            int multipleOfDigits = 1;
            for(int i= 0; i<digitCount; i++){
               multipleOfDigits *= digit;
            }
            // Add the result to sum
            sum += multipleOfDigits;

            temp = temp / 10;

        } while (temp != 0);

        return sum == originalNum;
    }

    // private static boolean isArmstrong(int n) {
    // int originalNum = n;
    // // base case
    // if (n < 0)
    // return false;
    // if (n == 0 || n == 1)
    // return true;

    // int sumofCubes = 0;
    // while (n != 0) {
    // int digit = n %10;
    // int cube = digit * digit * digit;
    // sumofCubes +=cube;
    // n = n/10;
    // }
    // if(sumofCubes == originalNum) return true;
    // return false;
    // }
}
