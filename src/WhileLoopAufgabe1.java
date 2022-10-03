import java.util.Random;

public class WhileLoopAufgabe1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;

        while (!isFinished) {
            int randomNumber = random.nextInt(10, 31);
            System.out.println(randomNumber);

            if ((randomNumber == 15) || (randomNumber == 25)) {
            isFinished = true;

            System.out.println("Finished");
            }
         }
    }
}