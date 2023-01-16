public class CaesarTask {
    public static void main(String[] args) {
        String result = encrypt(2, "a");
    }

    public static String encrypt(int shift, String stringToEncrypt) {

        char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            int letter = inputData[i] + shift;
            System.out.println("newLetter:" + Character.toString(letter));
        }
        return stringToEncrypt;
    }

    String result2 = encrypt(-2, "e");
    public static String decrypt(int shift, String stringToEncrypt) {
        char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            int letter = inputData[i] + shift;
            System.out.println("DecryptedLetter:" + Character.toString(letter));
        }
        return stringToEncrypt;

}
}


