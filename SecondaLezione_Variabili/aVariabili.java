//* File: SecondaLezione_Variabili/aVariabili.java
package SecondaLezione_Variabili;


/**
 *! Java 02: Variabili
 **  Come funzionano:
 *&  - Dichiarazione, assegnazione e inizializzazione
 *&  - Variabili con diversi tipi di dati
 *&  - Nomenclatura delle variabili
 */


public class aVariabili {
    
    public static void main(String[] args) {
        //^ Dichiarazione di variabili 
        //! Nota: In Java, le variabili devono essere dichiarate prima di essere utilizzate.
        /** -------------------------------------------------------------------------------- */

            int numeroIntero; // Dichiarazione di una variabile intera
            double numeroDecimale; // Dichiarazione di una variabile decimale
            String testo; // Dichiarazione di una variabile di tipo stringa
            float numeroDecimale2; // Dichiarazione di una variabile decimale a precisione singola

        /** -------------------------------------------------------------------------------- */


        //^ Assegnazione di valori alle variabili
        /** -------------------------------------------------------------------------------- */

            numeroIntero = 10; // Assegnazione di un valore intero
            numeroDecimale = 3.14; // Assegnazione di un valore decimale
            testo = "Ciao, Java!"; // Assegnazione di un valore stringa
            numeroDecimale2 = 2.718f; // Assegnazione di un valore decimale a precisione singola (con 'f' finale). 
            //! Nota: In Java, i numeri decimali sono di tipo double per default, 
            //! quindi per float bisogna aggiungere 'f' alla fine del numero.
        
        /** -------------------------------------------------------------------------------- */


        //^ Oppure di dichiarare e inizializzare in un'unica riga
        /** -------------------------------------------------------------------------------- */

            int numeroIntero2 = 20; // Dichiarazione, assegnazione e inizializzazione di una variabile intera
        
        /** -------------------------------------------------------------------------------- */


        //^ Esempio di sovrascrittura di una variabile
        /** -------------------------------------------------------------------------------- */
        
            numeroIntero2 = 30; // Assegnazione di un nuovo valore alla variabile intera (sovrascrittura)
        
        /** -------------------------------------------------------------------------------- */


        //^ Stampa dei valori delle variabili
        /** -------------------------------------------------------------------------------- */

            System.out.println("Numero Intero: " + numeroIntero);
            System.out.println("Numero Decimale: " + numeroDecimale);
            System.out.println("Testo: " + testo);
            System.out.println("Numero Intero 2: " + numeroIntero2);
            System.out.println("Numero Decimale 2: " + numeroDecimale2);

        /** -------------------------------------------------------------------------------- */
    }

}
