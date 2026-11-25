public class VowelandConsonantsCounts {
    public static void main(String[] args) {
        countVowelsAndConsonants("Rajatkumar");
    }

    public static void countVowelsAndConsonants(String str) {

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        int len = str.length() - 1;
        int vowelCount = 0;
        int constCount = 0;

        for (int i = 0; i <= len; i++) {
            char s = Character.toLowerCase(str.charAt(i));
            
            if (s <'a' || s > 'z') {
                continue;
            }
            
            boolean isVowel = false;
            for (int j = 0; j < vowels.length; j++) {
                if (s == vowels[j]) {
                    isVowel = true;
                    break;
                }
            }
            
            if (isVowel) {
                vowelCount++;
            } else {
                constCount++;
            }
        }
        System.out.println("Vowels counts are : " + vowelCount);
        System.out.println("Consonants counts are : " + constCount);
    }
}

// int[] digit = {1,2,3,4,5,6,7,8,9,0};
// if(str.isEmpty()){
// System.out.println("Vowels And Consonants: 0");
// }
// if(str.equals(digit)){
// System.out.println("Vowels And Consonants: 0");
// }