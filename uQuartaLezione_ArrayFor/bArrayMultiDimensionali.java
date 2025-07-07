package uQuartaLezione_ArrayFor;

/**
 * ! Java 04: Array Multidimensionali
 * ^  - Gli array multidimensionali sono array di array, 
 * ^    che possono essere utilizzati per rappresentare strutture dati più complesse.
 * ^  - In Java, gli array multidimensionali sono rappresentati come array di array.
 * ^  - La sintassi per dichiarare un array multidimensionale è simile a quella degli array unidimensionali, 
 * ^    ma con più coppie di parentesi quadre.
 * 
 * * Esempio di dichiarazione e inizializzazione di un array multidimensionale:
 *&              0       1       2
 *!  riga 0 -> Luca    Marco   Anna
 *!  riga 1 -> Sara    Giulia  Matteo
 *!  riga 2 -> Paolo   Chiara  Francesco
 */

public class bArrayMultiDimensionali {
    public static void main(String[] args) {

    //* Dichiarazione e inizializzazione di un array multidimensionale
    /** -------------------------------------------------------------------------------- */
        
        String[][] classi = {
            {"Luca", "Marco", "Anna"}, // Prima riga dell'array multidimensionale
            {"Sara", "Giulia", "Matteo"}, // Seconda riga dell'array multidimensionale
            {"Paolo", "Chiara", "Francesco"} // Terza riga dell'array multidimensionale
        };
        

        for (String[] classe: classi)
        {
            //^ Utilizzo di un ciclo for-each per iterare attraverso ogni classe
            // Stampa l'indice della classe e gli studenti in quella classe
            int classeIndex = java.util.Arrays.asList(classi).indexOf(classe); // Ottieni l'indice della classe corrente
            System.out.print("Classe " + (classeIndex + 1) + ": ");
            for (String studente: classe)
            {
                System.out.print(studente + " ");
            }
            System.out.println(); // Stampa una nuova riga dopo ogni classe
        }
    /** -------------------------------------------------------------------------------- */

    }
}
