package MyJavaTool;

import java.util.Scanner;

public class Messetool {
    public static void execMesstool(Scanner keyboard) {
        /**
         * zweiter Scanner, da mit nur einem Scanner die eingabe nicht richtig funktioniert hatte
         */
        Scanner keyboard2 = new Scanner(System.in);
        /**
         * Hier werden die Variablen deklariert
         * @param keyboard
         */
       double umsatz;
        String employer;
        String name;

        /**
         * Hier werden die Variablen mit Werten versehen
         */
        System.out.print("Gib deinen Namen ein: ");
        name = keyboard2.nextLine();
        System.out.print("Gib den Namen deines Arbeitgebers ein: ");
        employer = keyboard2.nextLine();
        System.out.print("Gib den Umsatz der Messe an: ");
        umsatz = keyboard.nextDouble();
        keyboard.nextLine();
        /**
         * Hier wird umsatz auf 2 nachkommastellen formatiert
         */
        String umsatzFormatted = String.format("%.2f", umsatz);

        /**
         * Hier wird die Ausgabe anhand der vorher gesetzen Werte ausgegeben
         */
        if (umsatz >= 4500) {
            System.out.println("Wup WUp " + name + ", " + employer + " geht ohne dich Insolvent, " + umsatzFormatted + "€ ist ja der Burner 🔥🔥🔥🔥🔥🔥");
        } else if (umsatz >= 2000) {
            System.out.println("Hey " + umsatzFormatted + "€ ist schon sehr toll, haste du super gemacht!!!! 👍👍👍");
        } else if (umsatz >= 1000) {
            System.out.println("Naja " + umsatzFormatted + "€ ist jetzt nicht die Welt aber Zumindest war es kein 0-Geschäft 👌👌👌");
        } else if (umsatz >= 1) {
            System.out.println("Naja , " + umsatzFormatted + "€ ist nicht die Welt aber die nächste Messe kommt bestimmt");
        } else if (umsatz <= 0) {
            System.out.println("Tjoa, ist blöd gelaufen");
        }

        System.out.println("Danke für die Nutzung des Tools!");
        System.out.println("---- Du wirst nun zum Hauptmenü zurückgeführt ----");

        System.out.println();
        System.out.println();
        System.out.println();




    }
}
