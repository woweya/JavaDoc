package kUndicesimaLezione_File;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        
        try {
            FileReader fileReader = new FileReader("kUndicesimaLezione_File\\esempio.txt"); // Crea un'istanza della classe FileReader
     
            int data = fileReader.read(); // Legge un byte dal file

            while(data != -1) { // Continua a leggere finché non raggiunge la fine del file
                System.out.print((char) data); // Stampa il byte letto come carattere
                data = fileReader.read(); // Legge il prossimo byte
            }

            System.out.println("Dati letti dal file: " + data); 
            //! Stampa i dati letti dal file (ma questo visualizza il numero dei caratteri letti, non il contenuto)

            fileReader.close(); // Chiude il file dopo la lettura

        } catch (IOException e) {
            e.printStackTrace(); // Stampa l'errore se si verifica un'eccezione
        }

    }
}
