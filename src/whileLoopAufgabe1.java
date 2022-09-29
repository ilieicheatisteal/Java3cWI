//Erstelle ein Programm
// dass Zufallszahlen zwischen 10 und 30 generiert.
// Das Programm soll die Zufallszahlen zusammenzählen.
// Sobald die Zahl 15 oder die Zahl 25 kommt,
// wird das Programm beendet und die Summe
// der vorherigen Zufallszahlen ausgegeben!

import java.util.Random;

public class whileLoopAufgabe1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber1 = random.nextInt(10)+20;
        System.out.println(randomNumber1);
    }
}