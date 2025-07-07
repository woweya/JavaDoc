package mTredicesimaLezione_Hashmap;

import java.util.HashMap;

/**
 * Java 13: HashMap
 * 
 * - Introduzione a HashMap
 *  * Come funziona HashMap
*     - Le hash map sono strutture dati che memorizzano coppie chiave-valore.
*     - Utilizzano una funzione di hash per mappare le chiavi agli indici.
*     - Le chiavi devono essere uniche, ma i valori possono essere duplicati.
 * - Operazioni di base: inserimento, ricerca, rimozione
 * - Iterazione su HashMap
 */

public class Main {

    public static void main(String[] args) {
        
        // Creazione di una HashMap
        HashMap<String, String> capitali = new HashMap<String, String>();

        // Inserimento di coppie chiave-valore
        capitali.put("Italia", "Roma"); // Inserisce la chiave "Italia" con il valore Roma
        capitali.put("Francia", "Parigi"); // Inserisce la chiave "
        capitali.put("Spagna", "Madrid"); // Inserisce la chiave "Spagna" con il valore Madrid
        capitali.put("Germania", "Berlino"); // Inserisce la chiave

        System.out.println("Capitale di Italia: " + capitali.get("Italia")); // Stampa la capitale dell'Italia
        System.out.println("Capitale di Francia: " + capitali.get("Francia")); // Stampa la capitale della Francia
        System.out.println("Capitale di Spagna: " + capitali.get("Spagna")); // Stampa la capitale della Spagna
        System.out.println("Capitale di Germania: " + capitali.get("Germania"));
        System.out.println("Capitali " + capitali); // Stampa null poiché la chiave non esiste

        // Rimozione di una coppia chiave-valore
        capitali.remove("Spagna"); // Rimuove la chiave "Spagna"
        System.out.println("Capitale di Spagna dopo rimozione: " + capitali.get("Spagna")); // Stampa null poiché la chiave è stata rimossa

        // Verifica se una chiave esiste
        if (capitali.containsKey("Italia")) {
            System.out.println("La capitale dell'Italia è: " + capitali.get("Italia")); // Stampa la capitale dell'Italia
        } else {
            System.out.println("La chiave 'Italia' non esiste nella mappa.");
        }


        // Iterazione su HashMap
        System.out.println("Iterazione su HashMap:");
        for (String paese : capitali.keySet()) { // Itera sulle chiavi della HashMap
            String capitale = capitali.get(paese); // Ottiene il valore associato alla chiave corrente
            System.out.println("La capitale di " + paese + " è: " + capitale); // Stampa la chiave e il valore
        }


        // Clear la HashMap
        capitali.clear(); // Rimuove tutte le coppie chiave-valore dalla HashMap
        System.out.println("Dopo clear, la HashMap è vuota: " + capitali.isEmpty()); // Verifica se la HashMap è vuota
        
    }
    
}
