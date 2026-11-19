package patterns_problems;

public class InvertedTriangle {
    public static void main(String[] args) {
        printInvertedTriangle(4);
    }

    public static void printInvertedTriangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
