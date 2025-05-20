package MyJavaTool;

import java.util.Scanner;

class Messetool {
    public static void execMesstool(Scanner keyboard) {
        double umsatz;


        System.out.println("Gib den Umsatz der Messe!");
        umsatz = keyboard.nextDouble();

        if (umsatz >= 4500) {
            System.out.println("Wup WUp AMC geht ohne dich Insolvent, " + umsatz + "€ ist ja der Burner 🔥🔥🔥🔥🔥🔥");
        } else if (umsatz >= 2000) {
            System.out.println("Hey " + umsatz + "€ ist schon sehr toll, haste du super gemacht!!!! 👍👍👍");
        } else if (umsatz >= 1000) {
            System.out.println("Naja " + umsatz + "€ ist jetzt nicht die Welt aber Zumindest war es kein 0-Geschäft 👌👌👌");
        } else if (umsatz >= 1) {
            System.out.println("Naja , " + umsatz + "€ ist nicht die Welt aber die nächste Messe kommt bestimmt");
        } else if (umsatz <= 0) {
            System.out.println("Tjoa, ist blöd gelaufen");
        }

        System.out.println();
        System.out.println();
        System.out.println();




    }
}
