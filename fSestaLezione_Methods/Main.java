package fSestaLezione_Methods;


public class Main {

    /**
     * Void significa che il metodo non restituisce alcun valore (System.out.println() è un esempio di metodo void).
     */

    public static void main(String[] args) {
        
        //^ Dichiarazione e inizializzazione di un metodo
        /** -------------------------------------------------------------------------------- */
        
            int risultato = somma(5, 10); // Chiama il metodo somma con i parametri 5 e 10

            int somma2 = somma(3, 4, 5); // Chiama il metodo somma con tre parametri

            double somma3 = somma(2.5, 3.5); // Chiama il metodo somma con due parametri di tipo double

            String somma4 = somma("Ciao ", "Mondo"); // Chiama il metodo somma con due stringhe
            
            System.out.println("La somma è: " + risultato); // Stampa il risultato della somma
        
        /** -------------------------------------------------------------------------------- */
    }

    //^ Definizione del metodo somma
    public static int somma(int a, int b) {

        return a + b; // Restituisce la somma dei due parametri

    }


    //^ Overload Methods
    //! Nota: Il metodo somma può essere definito più volte con lo stesso nome ma con parametri diversi (overloading).

    /** -------------------------------------------------------------------------------- */

    public static int somma(int a, int b, int c) {
        return a + b + c; // Restituisce la somma dei tre parametri
    }
    

    public static double somma(double a, double b) {
        return a + b; // Restituisce la somma dei due parametri di tipo double
    }


    public static String somma(String a, String b) {
        return a + b; // Restituisce la concatenazione delle due stringhe
    }
    

    /** -------------------------------------------------------------------------------- */
}