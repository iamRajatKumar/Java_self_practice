package conditions_methods_numberProblems;

public class EvenOddCount {

    public static void main(String[] args) {
        countEvenOddDigits(0);
    }

    public static void countEvenOddDigits(int number) {

    int evenCount = 0;
    int oddCount = 0;

    if (number == 0) {
        evenCount++;
    }

    while (number != 0) {

        int digit = number % 10;

        if (digit % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        number /= 10;
    }

    // Print evenCount here
    System.out.println(" Even Digit are "+evenCount);

    // Print oddCount here
    System.out.println(" Odd Digit are "+oddCount);
}


    // public static void countEvenOddDigits(int number) {

    //     // Your code here
    //     int evenCount = 0;
    //     int oddCount = 0;
        
    //     while(number != 0){
    //         int digit = number%10;
    //         if(digit % 2 == 0){
    //             evenCount++;
    //             System.out.println("Digit is "+digit+" Even Digit = "+evenCount);
    //         }else{
    //             oddCount++;
    //             System.out.println("Digit is "+digit+" Odd Digit = "+oddCount);
    //         }
    //         number /= 10;
    //    }
    // }
}
