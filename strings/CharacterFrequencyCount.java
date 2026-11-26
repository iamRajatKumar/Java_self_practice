public class CharacterFrequencyCount {
    public static void main(String[] args) {
        characterFrequency("banana");
    }

    public static void characterFrequency(String str) {
        int len = str.length();
        
        
        for (int i = 0; i < len; i++) {
            int count = 0;
            char c = str.charAt(i);
            for (int j = 0; j < len; j++) {
                if (c == str.charAt(j)) {
                    count++;
                }
            }
            boolean isCharPresent = false;
            for(int k=0; k<i; k++){
                if(c == str.charAt(k)){
                    isCharPresent = true;
                    
                }
            }
            if(isCharPresent){
                continue;
            }
            System.out.println(c + " : " + count);
        }
    }
}
