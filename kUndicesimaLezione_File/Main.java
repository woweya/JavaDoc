package kUndicesimaLezione_File;

/**
 * Java 11: File
 * 
 * - Creazione di un oggetto File
 * - Controllo dell'esistenza di un file
 * - Lettura e scrittura su file
 * - Eliminazione di file
 */

// Importa la classe File per lavorare con i file nel filesystem
import java.io.File;

public class Main {
    

    public static void main(String[] args) {
        
        File file = new File("kUndicesimaLezione_File\\esempio.txt"); // Crea un oggetto File con il nome del file

        if (file.exists()) { // Controlla se il file esiste
            System.out.println("Il file esiste.");
            System.out.println("Nome del file: " + file.getName()); // Stampa il nome del file
            System.out.println("Percorso assoluto: " + file.getAbsolutePath()); // Stampa il percorso assoluto del file
            System.out.println("Percorso relativo: " + file.getPath()); // Stampa il percorso relativo del file
            System.out.println("È un file: " + file.isFile()); // Controlla se è un file
            System.out.println("È una directory: " + file.isDirectory()); // Controlla se è una directory
            System.out.println("Dimensione del file: " + file.length() + " byte");  // Stampa la dimensione del file in byte

            //^ Se vuoi eliminare il file, puoi usare il metodo delete()
            /** -------------------------------------------------------------------------------- */

            //! if (file.delete()) {
            //*     System.out.println("Il file è stato eliminato con successo.");
            //! } else {
            //*    System.out.println("Impossibile eliminare il file.");    
            //! }

            /** -------------------------------------------------------------------------------- */

        } else {
            System.out.println("Il file non esiste.");
        }

    }



}
