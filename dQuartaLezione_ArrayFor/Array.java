package dQuartaLezione_ArrayFor;

public class Array {
    
    
    public static void main(String[] args) {

        //*  Dichiarazione e inizializzazione di array in Java
        /** -------------------------------------------------------------------------------- */
        
            int[] numeri = {1, 2, 3, 4, 5}; // Dichiarazione e inizializzazione di un array di interi
            String[] nomi = {"Alice", "Bob", "Charlie"}; // Dichiarazione e inizializzazione di un array di stringhe

        /** -------------------------------------------------------------------------------- */


        /** -------------------------------------------------------------------------------- */
            //^ Utilizzo di un ciclo for per iterare attraverso l'array di interi
            for (int i = 0; i < numeri.length; i++) {
                System.out.println("Numero: " + numeri[i]); // Stampa ogni numero dell'array
            }

            //^ Utilizzo di un ciclo for-each per iterare attraverso l'array di stringhe
            for (int j = 0; j < nomi.length; j++) {
                System.out.println("Nome: " + nomi[j]); // Stampa ogni nome dell'array
            }
        /** -------------------------------------------------------------------------------- */

        /** -------------------- OPPURE ----------------------- */

            //^ Utilizzo di un ciclo for-each per iterare attraverso l'array di interi
            for (int numero : numeri) {
                System.out.println("Numero (for-each): " + numero); // Stampa ogni numero dell'array
            }

            //^ Utilizzo di un ciclo for-each per iterare attraverso l'array di stringhe
            for (String nome : nomi) {
                System.out.println("Nome (for-each): " + nome); // Stampa ogni nome dell'array
            }

        /** -------------------------------------------------------------------------------- */
    }
}
