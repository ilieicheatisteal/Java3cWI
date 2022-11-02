public class caesarTask {

    public static void main(String[] args) {
        String result = encrypt(2, "a");
    }

    public static String encrypt(int shift, String stringToEncrypt) {
        String encryptedString = "encrypt";
        char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; 1 < inputData.length; i++) {
            int letter = inputData[i] + shift;
            System.out.println("newLetter:" + Character.toString(letter));
        }
        return encryptedString;
    }
}
