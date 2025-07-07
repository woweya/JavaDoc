package nQuattordicesimaLezione_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Java 14: Iterator
 *  * -Come funzona l'interfaccia Iterator
 *    - Utilizzo dell'interfaccia Iterator per iterare su collezioni
 *    - Esempi di utilizzo di Iterator con ArrayList
 */

public class Main {


    public static void main(String[] args) {
        // Creazione di un ArrayList di interi
        ArrayList<Integer> numeri = new ArrayList<Integer>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(3);
        numeri.add(4);
        numeri.add(5);

        // Creazione di un Iterator per l'ArrayList
        Iterator<Integer> iterator = numeri.iterator();

        // Iterazione sugli elementi dell'ArrayList utilizzando l'Iterator
        while (iterator.hasNext()) {
            Integer numero = iterator.next(); // Ottiene il prossimo elemento dell'ArrayList
            //! Posso anche rimuovere l'elemento corrente durante l'iterazione

            if(numero % 2 == 0) { // Se il numero è pari
                iterator.remove(); // Rimuove l'elemento corrente dall'ArrayList
                System.out.println("Numero rimosso: " + numero);
            }

            System.out.println("Numero: " + numero);
        }
    }
    
}
