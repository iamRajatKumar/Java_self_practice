package conditions_methods_numberProblems;

public class FibonacciSeries {

    public static void main(String[] args){
        printFibonacci(2);
    }

    public static void printFibonacci(int n) {

    // Write your logic
        
        //base case
        if(n <= 0){
            return;
        }
        int firstNum = 0; 
        int secondNum = 1;
        System.out.print(firstNum);
        if(n ==1){
            return;
        }
        System.out.print(", "+secondNum);
        for(int i = 3; i<= n; i++){
            int fib = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = fib;
            System.out.print(", "+fib);
        }
    }
}