public class CountCharacterOccurance {
    public static void main(String[] args) {
        System.out.println("Character Occurance is : "+countOccurrences("Raja",'a'));    
    }

    public static int countOccurrences(String str, char target) {
    
        // 0. create required variables 
        int len = str.length() ;
        int count = 0;

        // 1. break the string into characters using loop
        for(int i = 0; i<len; i++){
            char c = Character.toLowerCase(str.charAt(i));
        
            // 2. if char found increment the count
            if(c == target){
                count++;
            }
        }
        return count;

    }
}
