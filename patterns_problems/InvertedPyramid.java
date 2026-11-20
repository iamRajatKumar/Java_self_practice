package patterns_problems;

public class InvertedPyramid {

    public static void main(String[] args) {
        printInvertedPyramid(4);    
    }

    public static void printInvertedPyramid(int n) {

        for(int i=0; i<n; i++){
           
            for(int j = 1; j<= i; j++){
                System.out.print("  ");
            }
            for(int k= 1; k<=(2*n-1)-2*i; k++){
                System.out.print("* ");
            }
            System.out.println();
            
        }

    }

}
