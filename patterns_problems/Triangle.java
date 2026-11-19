package patterns_problems;

public class Triangle {
    public static void main(String[] args) {
        printTriangle(4);
    }

    public static void printTriangle(int n) {

        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
