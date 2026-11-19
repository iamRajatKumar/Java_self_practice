package patterns_problems;

public class RightAlignedTriangle {
    public static void main(String[] args) {
        printRightAlignedTriangle(4);
    }

    public static void printRightAlignedTriangle(int n) {
        
      for(int i=1; i<=n; i++){
            for(int j = n-1; j<=1; j--){
                for(int k =1; k<=i; k++){
                    System.out.print(" *");
                }
                System.out.println();
            }     
        }

    }
}
// You'll need an outer loop for rows, one inner loop for leading spaces, 
// and another inner loop for stars. Use "  " (two spaces) for each leading-space group and "* " for each star.
// for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
// for(int i=n; i>=1; i--){
            
//             System.out.print(i+" ");
//         }



// for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
            
//         }
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 


  // for(int i=n; i>=1; i--){
        //     for(int j=n; j>=1; j--){
        //         for(int k =n-1; k>=1; k--){
        //             System.out.print(" * ");
        //         }
        //         System.out.println();    
        //     }
        //     System.out.println();
            
        // }