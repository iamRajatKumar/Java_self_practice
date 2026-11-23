public class VowelsInString {

    public static void main(String[] args) {
        System.out.println("Vowels are : " + countVowels("hello"));
    }

    public static int countVowels(String str) {

        int len = str.length();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        int vowelCount = 0;
       
        for(int i = 0; i<len; i++){
            char c = str.charAt(i);
            for(int j=0; j<vowels.length; j++){
                if(c == vowels[j]){
                    vowelCount++;
                }
            }           
        }
        return vowelCount;
    }
}
