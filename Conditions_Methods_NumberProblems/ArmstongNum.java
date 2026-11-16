package conditions_methods_numberProblems;

public class ArmstongNum {

    public static void main(String[] args) {
        System.out.println("Armstrong num : " + isArmstrong(123));
    }

    private static boolean isArmstrong(int n) {
        int originalNum = n;
        // base case
        if (n < 0)
            return false;
        if (n == 0 || n == 1)
            return true;

        int sumofCubes = 0;
        while (n != 0) {
            int digit = n %10;
            int cube = digit * digit * digit;
            sumofCubes +=cube;
            n = n/10;
        }
        if(sumofCubes == originalNum) return true;
        return false;
    }
}
