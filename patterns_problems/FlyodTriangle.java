package patterns_problems;

public class FlyodTriangle {

    public static void main(String[] args) {
        printFloydTriangle(4);
    }

    public static void printFloydTriangle(int n) {
        int number = 1;
        for(int i = 1; i<=n; i++){
            for(int j =0; j<=i-1; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
