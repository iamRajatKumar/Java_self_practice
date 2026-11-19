package conditions_methods_numberProblems.revision;

public class CountEvenDigits {
    public static void main(String[] args){
        System.out.println("Even digits are : "+countEven(123456));
    }

    private static int countEven(int n) {
        if(n < 0) return 0;
        if(n == 0) return 1;
        int count = 0;
        while(n != 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}
