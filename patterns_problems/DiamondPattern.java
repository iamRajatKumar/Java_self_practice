package patterns_problems;

public class DiamondPattern {
    public static void main(String[] args) {
        printDiamond(5);
    }

    public static void printDiamond(int n) {
        
        for(int i = 1; i<=n; i++){
            
            for(int j= 1; j<=n-i; j++){
                System.out.print("  ");
            }
            
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i<n; i++){
            
            for(int j= 1; j<=i; j++){
                System.out.print("  ");
            }
            
            for(int k = 1; k<=(2*n-1)-2*i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
