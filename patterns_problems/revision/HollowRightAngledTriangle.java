package patterns_problems.revision;

public class HollowRightAngledTriangle {
    public static void main(String[] args) {
        printHollowTriangle(4);
    }

    public static void printHollowTriangle(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i || i==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

                // if(j==0 || j==n-1){
                //     System.out.print("* ");
                // }else{
                //     System.out.print(" ");
                // }

            //     for(int j=0; j<=i; j++){
            //     System.out.print("* ");
            // }