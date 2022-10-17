//Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine fixe Anzahl Stellen verschoben (z.B. 2) a wird zu c, f wird zu h, z wird zu b usw.
//Implementiere eine Methode encrypt(String):String und eine Methode decrypt(String):String
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
