package gSettimaLezione_OOP;


/**
 * ! Java 07: Object-Oriented Programming (OOP)
 * ^  - La programmazione orientata agli oggetti (OOP) è un paradigma di programmazione che utilizza "oggetti" per rappresentare dati e comportamenti.
 * ^  - Gli oggetti sono istanze di classi, che definiscono le proprietà (attributi) e i metodi (funzionalità) degli oggetti.
 * ^  - Le classi possono essere definite utilizzando la parola chiave "class".
 * ^  - Le classi possono avere costruttori, che sono metodi speciali utilizzati per creare e inizializzare gli oggetti.
 * ^  - Le classi possono estendere altre classi (ereditarietà) e implementare interfacce.
 * ^  - L'incapsulamento consente di nascondere i dettagli di implementazione e di esporre solo ciò che è necessario.
 * ^  - Il polimorfismo consente di utilizzare metodi con lo stesso nome ma con comportamenti diversi a seconda del contesto.
 */

public class Main {
    
    //^ Creo una classe chiamata "Persona" in Persona.java e la utilizzo in questo file.
    /**
     * ! Classe Persona
     * ^  - Questa classe rappresenta una persona con nome, cognome, età e città.
     * ^  - Ha un costruttore per inizializzare i dati della persona.
     * ^  - Ha un metodo saluta() che stampa un messaggio di saluto.
     */

    public static void main(String[] args) {
        
        //^ Creazione di un oggetto della classe Persona
        /** -------------------------------------------------------------------------------- */
        
            Persona persona1 = new Persona("Mario", "Rossi", 30, "Roma"); // Crea un oggetto Persona con i dati specificati
            
        /** -------------------------------------------------------------------------------- */

        //^ Utilizzo dei metodi della classe Persona
        /** -------------------------------------------------------------------------------- */
        
            persona1.saluta(); // Chiama il metodo saluta dell'oggetto persona1
            
            String nome = persona1.getNome(); // Chiama il metodo getNome per ottenere il nome della persona
            System.out.println("Il nome della persona è: " + nome); // Stampa il nome della persona


            
            persona1.setNome("Luigi"); // Chiama il metodo setNome per cambiare il nome della persona
            System.out.println("Il nuovo nome della persona è: " + persona1.getNome());


        /** -------------------------------------------------------------------------------- */

    }


}
