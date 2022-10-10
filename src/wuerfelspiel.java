import java.util.Random;
import java.util.Scanner;

public class wuerfelspiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isFinished = false;
        int botwins = 0;
        int playerwins = 0;
        int rolls = 5;
        System.out.println("WÜRFELSPIEL");
        System.out.println("    [1] Spiel Starten");
        System.out.println("    [2]Spielregeln");
        System.out.println("    [3]Verlassen");
        while (!isFinished) {

            int selection = scanner.nextInt();
            if (rolls == 0) {
                System.out.println("Das Spiel endet " + playerwins + " zu " + botwins + "!");
                isFinished = true;
            }
            if (selection == 1) {
                rolls = rolls - 1;

                int randomNumber = random.nextInt(1, 7);
                System.out.println("Du hast " + randomNumber + " Gewürfelt!");
                int randomNumberBOT = random.nextInt(1, 7);
                System.out.println("Der Computer hat " + randomNumberBOT + " Gewürfelt!");
                if (randomNumber > randomNumberBOT) {
                    playerwins = playerwins + 1;
                    System.out.println("Diese Runde hast du gewonnen!");
                }
                if (randomNumberBOT > randomNumber) {
                    botwins = botwins + 1;
                    System.out.println("Diese Runde hast du verloren!");
                }
                if (randomNumberBOT == randomNumber) {
                    botwins = botwins + 1;
                    playerwins = playerwins + 1;
                    System.out.println("Unentschieden!");
                    if (rolls == 0) {
                        System.out.println("Das Spiel endet " + playerwins + " zu" + botwins);
                        isFinished = true;
                    }
                }


            }
        }
        System.out.println("test");
    }
}