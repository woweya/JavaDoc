/**
* Java: Prima Lezione
* Come funziona:
*  1. Computer usano codice macchina (0 e 1)
*  2. Noi scriviamo codice ad alto livello in file .java
*  3. Quando compilato, il codice viene trasformato in bytecode
*  4. Quando però compiliamo, il codice è specifico per un sistema operativo
*  5. Java mette a disposizione uno step intermediario:
*     - Source code --> compiler --> bytecode (.class) --> jvm --> machine code
*  6. JVM (Java Virtual Machine) è un interprete che legge il bytecode. (JDK)
*  7. JDK (Java Development Kit) è un insieme di strumenti per sviluppare in Java.
*  8. JRE (Java Runtime Environment) è l'ambiente di esecuzione di Java.
*  9. JDK include JRE, ma JRE non include JDK.
* 10. Ci serve un IDE (Integrated Development Environment) per scrivere codice Java.
* 11. Esempi di IDE: IntelliJ IDEA, Eclipse, NetBeans, Visual Studio Code.
*/


public class Main {
    /**
     * Metodo principale che viene eseguito all'avvio del programma.
     * 
     * @param args Argomenti della riga di comando (non utilizzati in questo esempio).
     */
    public static void main(String[] args) {
        // Stampa "Hello, World!" sulla console
        //ln sta per "line" e indica che vogliamo andare a capo dopo la stampa
        System.out.println("Hello, World!");
    }

    


}