package hOttavaLezione_FinalStatic;

/**
 * Java 08: Final e Static
 * 
 * - final: variabili, metodi, classi
 * - static: variabili, metodi, classi
 */

public class Main {
    

    public static void main(String[] args) {
        
        // Dichiarazione e inizializzazione di una variabile finale
        final int numeroFinale = 10; // Una volta assegnato, non può essere modificato
        
        //!  numeroFinale = 15; // Questo causerà un errore di compilazione, poiché numeroFinale è final


        // Stampa della variabile finale
        System.out.println("Il numero finale è: " + numeroFinale);
        

        // Dichiarazione e inizializzazione di una variabile statica
        Persona persona1 = new Persona("Mario", "Rossi"); // Crea un oggetto Persona
        Persona persona2 = new Persona("Alice", "Bianchi"); // Crea un altro oggetto Persona

        // Stampa il numero di persone create (static)
        //!  System.out.println("Numero di persone create: " + Persona.numeroPersone); // Stampa il numero di persone create

        // Chiama il metodo statico per mostrare il numero di persone create
        Persona.mostraNumeroPersone(); // Stampa il numero di persone create
    }

}
