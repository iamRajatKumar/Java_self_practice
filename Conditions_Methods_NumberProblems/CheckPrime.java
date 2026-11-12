package Conditions_Methods_NumberProblems;

public class CheckPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(24));
    }

    // public static boolean isPrime(int number) {

    //     // Write your logic here
    //     if(number <= 1){
    //         return false; //base condition
    //     }
    //     int divisor = 2;
    //     while(number > divisor){
    //         if(number % divisor == 0){
    //             return false;
    //         }
    //         divisor++;
        
    //     }
    //     return  true;
       
    // }

    public static boolean isPrime(int number) {

    if (number <= 1) {
        return false;
    }

    int divisor = 2;
    /* Your optimized condition */
    while (divisor <= number/divisor) {

        if (number % divisor == 0) {
            return false;
        }

        divisor++;
    }

    return true;
}
}
