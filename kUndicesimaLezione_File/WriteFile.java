package kUndicesimaLezione_File;

import java.io.FileWriter;

public class WriteFile {
    

    public static void main(String[] args) {


        try {
            FileWriter fileWrited = new FileWriter("kUndicesimaLezione_File\\esempio.txt", true); // Crea un oggetto FileWriter per scrivere su un file, in modalità append
        
         //^ Se vuoi scrivere il file, puoi usare:
            /** -------------------------------------------------------------------------------- */

            fileWrited.write("Ciao, questo è un esempio di scrittura su file.\n"); // Scrive una stringa nel file
            fileWrited.append("Aggiungiamo un'altra riga di testo.\n"); // Aggiunge un'altra riga alla fine del file
            fileWrited.append("Questa riga verrà aggiunta alla fine del file."); // Aggiunge una riga alla fine del file
            fileWrited.close(); // Chiude il FileWriter per salvare le modifiche

            /** -------------------------------------------------------------------------------- */
        } catch (Exception e) {
            e.printStackTrace(); // Stampa l'errore se si verifica un'eccezione
        }
    }
}
