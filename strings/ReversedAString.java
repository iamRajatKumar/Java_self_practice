public class ReversedAString {
    public static void main(String[] args) {
        System.out.println("Reversed string :" +reverseString("Hello"));
    }

    public static String reverseString(String str) {
        
        String reverse = "";
        int len= str.length()-1;

        for(int i=len; i>= 0; i--){
            char c = str.charAt(i);
            reverse += c;
        }
        return reverse;
       
           
    }
}
