package uQuartaLezione_ArrayFor;

import java.util.ArrayList;

/**
 * *! Java 04: ArrayList
 * ^  - Gli ArrayList sono una struttura dati dinamica che può contenere un numero
 * ^    variabile di elementi, a differenza degli array tradizionali che hanno una
 * ^    dimensione fissa.
 * ^  - Gli ArrayList sono parte della libreria Java Collections Framework e
 * ^    forniscono metodi per aggiungere, rimuovere e accedere agli elementi.
 * ^  - Gli ArrayList sono generici, il che significa che possono contenere
 * ^    qualsiasi tipo di oggetto, ma è consigliabile specificare il tipo di og
 * ^    oggetto che si desidera memorizzare per evitare errori di tipo.
 */

public class cArrayList {
    
    public static void main(String[] args) {
        
        //* Dichiarazione e inizializzazione di un ArrayList 2D in Java
        /** -------------------------------------------------------------------------------- */
        
            ArrayList<String> listaNomi = new ArrayList<String>(); // Creazione di un ArrayList per memorizzare stringhe
            
        /** -------------------------------------------------------------------------------- */

        //* Dichiarazione e inizializzazione di un ArrayList MultiDimensionale in Java
        /** -------------------------------------------------------------------------------- */
        
            ArrayList<ArrayList<String>> listaNomi2 = new ArrayList<ArrayList<String>>(); // Creazione di un ArrayList per memorizzare stringhe
            
            // Aggiunta di ArrayList all'ArrayList MultiDimensionale
            ArrayList<String> lista1 = new ArrayList<String>();
            lista1.add("Alice");
            lista1.add("Bob");
            listaNomi2.add(lista1); // Aggiunge il primo ArrayList all'ArrayList 2D

        /** -------------------------------------------------------------------------------- */

        //* Aggiunta di elementi all'ArrayList
        /** -------------------------------------------------------------------------------- */

            listaNomi.add("Alice"); // Aggiunge "Alice" all'ArrayList
            listaNomi.add("Bob"); // Aggiunge "Bob" all'ArrayList
            listaNomi.add("Charlie"); // Aggiunge "Charlie" all'ArrayList

        /** -------------------------------------------------------------------------------- */

        //* Stampa degli elementi dell'ArrayList
        /** -------------------------------------------------------------------------------- */

            System.out.println("Elementi dell'ArrayList:");
            for (String nome : listaNomi) {
                System.out.println(nome); // Stampa ogni nome nell'ArrayList
            }

        /** -------------------------------------------------------------------------------- */

        //* Rimozione di un elemento dall'ArrayList
        /** -------------------------------------------------------------------------------- */

            listaNomi.remove("Bob"); // Rimuove "Bob" dall'ArrayList

        /** -------------------------------------------------------------------------------- */

        //* Modifica di un elemento nell'ArrayList
        /** -------------------------------------------------------------------------------- */

            listaNomi.set(1, "David"); // Modifica l'elemento all'indice 1 (secondo elemento) in "David"

        /** -------------------------------------------------------------------------------- */

          //*  Get e Size dell'ArrayList
        /** -------------------------------------------------------------------------------- */
            //^ Utilizzo di get() per accedere a un elemento specifico
            if (!listaNomi.isEmpty()) { // Verifica se l'ArrayList non è vuoto
                String primoNome = listaNomi.get(0); // Ottiene il primo elemento dell'ArrayList
                System.out.println("Primo nome nell'ArrayList: " + primoNome);
            }
            
            int dimensione = listaNomi.size(); // Ottiene la dimensione dell'ArrayList
            System.out.println("Dimensione dell'ArrayList: " + dimensione + " elementi");
        
        /** -------------------------------------------------------------------------------- */


        //* Array MultiDimensionale
        /** -------------------------------------------------------------------------------- */ 

            for (ArrayList<String> listaNome : listaNomi2) {
                //^ Utilizzo di un ciclo for-each per iterare attraverso ogni ArrayList all'interno dell'ArrayList 2D
                System.out.println("Lista di nomi:");
                for (String nome : listaNome) {
                    System.out.println("Nome:" + nome); // Stampa ogni nome nell'ArrayList interno
                }
            }
            
        /** -------------------------------------------------------------------------------- */

        //* Stampa degli elementi dell'ArrayList dopo la rimozione e la modifica
        /** -------------------------------------------------------------------------------- */

            System.out.println("Elementi dell'ArrayList dopo la rimozione e la modifica:");
            for (String nome : listaNomi) {
                System.out.println(nome); // Stampa ogni nome nell'ArrayList
            }

        /** -------------------------------------------------------------------------------- */

        //* Clear dell'ArrayList
        /** -------------------------------------------------------------------------------- */
            
            listaNomi.clear(); // Rimuove tutti gli elementi dall'ArrayList
            // Nota: Dopo il clear, l'ArrayList sarà vuoto, ma la sua capacità rimarrà invariata.
            System.out.println("Elementi dell'ArrayList dopo il clear: " + listaNomi.size() + " elementi"); // Stampa la dimensione dell'ArrayList dopo il clear
        /** -------------------------------------------------------------------------------- */
    }


}
