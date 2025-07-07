package eQuintaLezione_StringMethods;

/** 
 * ! Java 05: String Methods
 * ^  - Le stringhe in Java sono oggetti immutabili che rappresentano sequenze di caratteri.
 * ^  - Le stringhe possono essere create utilizzando le virgolette doppie ("") o la classe String.
 * ^  - Le stringhe hanno molti metodi utili per manipolare e analizzare il testo.
 * ^  - Alcuni dei metodi più comuni includono:
 * *    - length(): restituisce la lunghezza della stringa.
 * *    - charAt(int index): restituisce il carattere alla posizione specificata.
 * *    - substring(int beginIndex, int endIndex): restituisce una sottostringa dalla posizione beginIndex (inclusa) a endIndex (esclusa).
 * *    - indexOf(String str): restituisce l'indice della prima occorrenza della sottostringa specificata.
 * *    - toLowerCase(): converte la stringa in minuscolo.
 * *    - toUpperCase(): converte la stringa in maiuscolo.
 * *    - trim(): rimuove gli spazi bianchi all'inizio e alla fine della stringa.
 * *    - replace(char oldChar, char newChar): sostit
 * *    - equals(Object anObject): confronta due stringhe per verificare se sono uguali.
 * *    - split(String regex): divide la stringa in un array di sottostringhe
 * *    - contains(CharSequence sequence): verifica se la stringa contiene una sottostringa
 * *    - startsWith(String prefix): verifica se la stringa inizia con un prefisso specificato
 * *    - endsWith(String suffix): verifica se la stringa termina con un suffisso specificato
 * *    - isEmpty(): verifica se la stringa è vuota
 * *.   - equalsIgnoreCase(String anotherString): confronta due stringhe ignorando le differenze tra maiuscole e minuscole
*/

public class Main {


    public static void main(String[] args) {
        
        String testo = "Questo è un esempio di stringa Java manipolata"; // Dichiarazione e inizializzazione di una stringa

        //^ Utilizzo di alcuni metodi della classe String
        /** -------------------------------------------------------------------------------- */

            int lunghezza = testo.length(); // Ottiene la lunghezza della stringa
            char primoCarattere = testo.charAt(0); // Ottiene il primo carattere
            String sottostringa = testo.substring(2, 6); // Ottiene una sottostringa dalla posizione 2 alla 6 (esclusa)
            int indice = testo.indexOf("Java"); // Ottiene l'indice della prima occorrenza della sottostringa "Java"
            String minuscolo = testo.toLowerCase(); // Converte la stringa in minuscolo
            String maiuscolo = testo.toUpperCase(); // Converte la stringa in maiuscolo
            String senzaSpazi = testo.trim(); // Rimuove gli spazi bianchi all'inizio e alla fine della stringa (non rimuove gli spazi tra le parole)
            //! Nota: Il metodo trim() non rimuove gli spazi tra le parole,
            //! ma solo gli spazi bianchi all'inizio e alla fine della stringa.

            String senzaSpaziAll = testo.replace(" ", ""); // Rimuove tutti gli spazi dalla stringa
            String sostituita = testo.replace('a', 'K'); // Sostituisce il carattere 'J' con 'K'
            boolean sonoUguali = testo.equals("Questo è un esempio di stringa Java manipolata"); // Confronta la stringa con un'altra stringa per verificare se sono uguali

        /** -------------------------------------------------------------------------------- */

            //! Nota: Il metodo equals() è case-sensitive, quindi "Java" e "java" sono considerati diversi.
            //! Per confrontare due stringhe ignorando le differenze tra maiuscole e minuscole, si può usare il metodo equalsIgnoreCase().

        /** -------------------------------------------------------------------------------- */

            boolean ugualiIgnorandoCase = testo.equalsIgnoreCase("questo è un esempio di stringa java manipolata"); // Confronta due stringhe ignorando le differenze tra maiuscole e minuscole
            boolean contiene = testo.contains("Java"); // Verifica se la stringa contiene "Java"
            boolean iniziaCon = testo.startsWith("Questo"); // Verifica se la stringa inizia con "Questo"
            boolean finisceCon = testo.endsWith("a"); // Verifica se la stringa termina con "a"
            boolean eVuota = testo.isEmpty(); // Verifica se la stringa è vuota


        //^ Stampa dei risultati
        /** -------------------------------------------------------------------------------- */

        System.out.println("Lunghezza: " + lunghezza);
        System.out.println("Primo carattere: " + primoCarattere);
        System.out.println("Sottostringa: " + sottostringa);
        System.out.println("Indice di 'Java': " + indice);      
        System.out.println("Minuscolo: " + minuscolo);
        System.out.println("Maiuscolo: " + maiuscolo);
        System.out.println("Senza spazi: " + senzaSpazi);
        System.out.println("Senza spazi (tutti): " + senzaSpaziAll);
        System.out.println("Sostituita: " + sostituita);
        System.out.println("Sono uguali: " + sonoUguali);
        System.out.println("Contiene 'Java': " + contiene);
        System.out.println("Inizia con 'Questo': " + iniziaCon);
        System.out.println("Finisce con 'a': " + finisceCon);
        System.out.println("È vuota: " + eVuota);
        System.out.println("Uguali ignorando case: " + ugualiIgnorandoCase);
    }
}
