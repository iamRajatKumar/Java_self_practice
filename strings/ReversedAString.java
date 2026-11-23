public class ReversedAString {
    public static void main(String[] args) {
        System.out.println("Reversed string :" + reverseString("Hello"));
    }

    public static String reverseString(String str) {

        StringBuilder sb = new StringBuilder();
        int len = str.length() -1;
        
        for(int i = len; i>= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // public static String reverseString(String str) {

    // String reverse = "";
    // int len= str.length()-1;

    // for(int i=len; i>= 0; i--){
    // char c = str.charAt(i);
    // reverse += c;
    // }
    // return reverse;

    // }
}


//"StringBuilder is mutable, so repeated appends avoid the repeated copying caused by String concatenation in a loop. 
// This generally reduces the time complexity from O(n²) to O(n). 
// StringBuilder is also unsynchronized, unlike StringBuffer, making it a suitable choice for single-threaded operations."