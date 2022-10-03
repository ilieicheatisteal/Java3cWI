import java.util.Scanner;
public class bankomataufgabe {
    public static void main(String[] args) {
        boolean isFinished = false;
        int balance = 0;
        System.out.println("Selektieren sie die gewünschte Funktion:");
        System.out.println("    1. Einzahlen");
        System.out.println("    2. Abheben");
        System.out.println("    3. Kontostand");
        System.out.println("    4. Ende");
        while (!isFinished) {
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Geben sie den Betrag ein den sie einzahlen möchten");
                int deposit = scanner.nextInt();

                balance = balance + deposit;
                System.out.println("Sie haben " + deposit + "€ eingezahlt!");
            }
            if (selection == 2) {
                System.out.println("Wieviel würden Sie gerne abheben?");
                int withdraw = scanner.nextInt();
                balance = balance - withdraw;
                System.out.println("Sie haben " + withdraw + "€ abgehoben!");
            }
            if (selection == 3) {
                System.out.println("Der Kontostand beträgt:" + balance + "€");
            }

            if (selection == 4) {
                isFinished = true;
                System.out.println("Machine is stopping!");
            }
        }
    }
}