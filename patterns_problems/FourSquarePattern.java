package patterns_problems;

public class FourSquarePattern {
    public static void main(String[] args) {
        printSquare(4);
    }

    public static void printSquare(int n) {

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
