package patterns_problems.revision;

public class NumberPattern {
    public static void main(String[] args) {
        printNumberTriangle(5);
    }

    public static void printNumberTriangle(int n) {
        int number =1;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number = number+1;
            }
            System.out.println();
        }
    }
}
