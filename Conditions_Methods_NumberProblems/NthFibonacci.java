package conditions_methods_numberProblems;

public class NthFibonacci {
    
    public static void main(String[] args) {
        System.out.println("Nth Fibonnaci num : "+nthFibonaaci(10));
    }

    private static int nthFibonaaci(int n) {
        //base case
        if(n <=0) return -1;
        if(n ==1) return 0;
        if(n == 2) return 1;
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;
        for(int i = 3; i<= n; i++){
            sum  = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
        return secondNum;
    }
}
