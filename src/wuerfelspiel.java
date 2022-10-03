import java.util.Random;
import java.util.Scanner;

public class wuerfelspiel {
    public static void main(String[] args) {
        boolean isFinished = false;
        int wuerfe = 5;
        System.out.println("WÜRFELSPIEL");
        System.out.println("    [1] Spiel Starten");
        System.out.println("    [2]Spielregeln");
        System.out.println("    [3]Verlassen");
        while (!isFinished) {
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
if (wuerfe == 0) {
    System.out.println("Game Over.");
    isFinished = true;
}
            if (selection == 1) {
                wuerfe = wuerfe - 1;
                Random random = new Random();
                int randomNumber = random.nextInt(1, 7);
                System.out.println("Du hast " + randomNumber + " Gewürfelt!");
                int randomNumberBOT = random.nextInt(1, 7);
                System.out.println("Der Computer hat " + randomNumberBOT + " Gewürfelt!");
                if (randomNumber > randomNumberBOT) {
                    System.out.println("Diese Runde hast du gewonnen!");
                    if (randomNumberBOT > randomNumber) {
                        System.out.println("Diese Runde hast du verloren!");
                        if (randomNumberBOT == randomNumber) {
                            System.out.println("Unentschieden!");
                            if (wuerfe == 0) {
                                System.out.println("Game Over.");
                                isFinished = true;
                            }
                        }
                    }
                } else if (randomNumberBOT > randomNumber) {
                    System.out.println("Diese Runde hast du verloren!");

                } else if (randomNumberBOT == randomNumber) {
                    System.out.println("Unentschieden!");
                }
            }
            if (selection == 2) {
                System.out.println("Du startest mit 6 wurfen. Wenn der Computer eine Höhere Zahl als du Würfelt, verlierst du. Wenn du eine Höhere Zahl Würfelst, gewinnst du.");
            }
            if (selection == 3) {
                System.out.println("Game Over.");
                isFinished = true;
            }
        }
    }
}