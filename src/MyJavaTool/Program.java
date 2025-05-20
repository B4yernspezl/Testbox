/**
 * @author = Thomas Achatz
 * @version = 0.2-alpha
 */

package MyJavaTool;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        byte prgchse;
        boolean exitProgram = false;
        Scanner keyboard = new Scanner(System.in);


        while(!exitProgram) {
            /**
             * Hier findet die Auswahl des Programms statt die ausgeführt werden soll
             */
            System.out.println("Willkommen im Hauptmenü");
            System.out.println("Welches Tool möchtest du ausführen?");
            System.out.println("(1) Messetool");
            System.out.println("(2) Placeholder");
            System.out.println("(3) Hello world");
            System.out.println("(4) Programm beenden");
            System.out.print("Deine Auswahl: ");

            /**
             * Hier wird nun das Programm ausgewählt
             */

            prgchse = keyboard.nextByte();
            switch (prgchse) {
                case 1:
                    Messetool.execMesstool(keyboard);
                    break;
                case 2:
                    System.out.println("Hier ist leider noch kein MyJavaTool.Program entstanden");
                    break;
                case 3:
                    HelloWorld.hw();
                    break;
                case 4:
                    keyboard.close();
                    exitProgram = true;
                    break;
            }
        }



    }
}