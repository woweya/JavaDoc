package bSecondaLezione_Variabili;

/**
 * ! Java 03: Tipi di Dati primitive e reference
    *^  - boolean: rappresenta un valore vero o falso (true o false).
    *^  - byte: un intero a 8 bit, con valori da -128 a 127.
    *^  - short: un intero a 16 bit, con valori da -32.768 a 32.767.
    *^  - int: un intero a 32 bit, con valori da -2.147.483.648 a 2.147.483.647.
    *^  - long: un intero a 64 bit, con valori da -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.
    *^  - float: un numero decimale a 32 bit, con una precisione di circa 7 cifre decimali.
    *^  - double: un numero decimale a 64 bit, con una precisione di circa 15 cifre decimali.
    *^  - char: un carattere Unicode a 16 bit, che può rappresentare un singolo carattere.
    *^  - String: una sequenza di caratteri, che può essere utilizzata per rappresentare testo.
    *^  - Ogni tipo di dato ha una dimensione specifica in memoria e 
    *^    un intervallo di valori che può rappresentare.
 */




public class bTipiDati {

    public static void main(String[] args) {
        
        //^ Dichiarazione e inizializzazione di variabili di tipo primitivo
        /** -------------------------------------------------------------------------------- */
            // Queste sono primitive, che hanno il type in minuscolo.
            boolean isJavaFun = true; // Variabile booleana
            byte byteValue = 127; // Variabile byte
            short shortValue = -32768; // Variabile short
            int intValue = 2_000_000_000; // Variabile intera
            long longValue = 2_000_000_000_000_000L; // Variabile long (con 'L' finale per indicare che è un long)
            float floatValue = 10.534343f; // Variabile float (con 'f' finale)
            double doubleValue = 20.994845854985; // Variabile double
            char charValue = 'A'; // Variabile char (un singolo carattere)

        /** -------------------------------------------------------------------------------- */


        //! Nota: In Java, String si usa con "", mentre char si usa con ''
        //STRING è una reference, che ha il type in maiuscolo e può avere dei metodi associati.
            // Es: stringValue.toUpperCase();
            String stringValue = "Hello, Java!"; // Variabile stringa

            //^ Stampa dei valori delle variabili
            System.out.println("Boolean: " + isJavaFun);
            System.out.println("Byte: " + byteValue);
            System.out.println("Short: " + shortValue);
            System.out.println("Int: " + intValue);
            System.out.println("Long: " + longValue);
            System.out.println("Float: " + floatValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Char: " + charValue);
            System.out.println("String: " + stringValue);

    }

}
