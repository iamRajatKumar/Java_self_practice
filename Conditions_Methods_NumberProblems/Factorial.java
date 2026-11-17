package conditions_methods_numberProblems;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(int number) {

        // base condition
        // if (number == 0 || number == 1) {
        //     return 1;
        // }
        // Write your implementation
        long num = 1;
        while (number > 0) {
            num *= number;
            number--;
        }
        return num;

    }
}
