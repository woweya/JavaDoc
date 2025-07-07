package cTerzaLezione_UserInput;

/**
    *!  Java 03: User Input
    *^   Usiamo Scanner, la classe per leggere l'input dell'utente da console.
        *? - import java.util.Scanner;
        *? - creare un oggetto Scanner
        *? - creare domande per utente: nome, cognome, età, città
    *
 */

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {   
        
        //^ Creazione di un oggetto Scanner per leggere l'input dell'utente
    
        Scanner scanner = new Scanner(System.in); // Crea un oggetto Scanner per leggere l'input da System.in (la console)

        //^ Creazione di domande per l'utente
        
        /** -------------------------------------------------------------------------------- */

            System.out.print("Inserisci il tuo nome: ");
            String nome = scanner.nextLine(); // Utilizza nextLine() per leggere una riga di testo
            
            System.out.print("Inserisci il tuo cognome: ");
            String cognome = scanner.nextLine();
            
            System.out.print("Inserisci la tua età: ");
            int eta = scanner.nextInt(); // Utilizza nextInt() per leggere un numero intero

            // Consuma il newline rimasto dopo nextInt() 
            // (Se non lo fai, il prossimo nextLine() non funzionerà correttamente)
            scanner.nextLine(); // Questo è importante per evitare problemi con la lettura della stringa successiva
            

            System.out.print("Inserisci la tua città: ");
            String citta = scanner.nextLine();

        /** -------------------------------------------------------------------------------- */

        //^ Stampa dei dati inseriti dall'utente
        
        System.out.println("Ciao " + nome + " " + cognome + ", hai " + eta + " anni e vivi a " + citta + ".");
    }
}
