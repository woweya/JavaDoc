package hOttavaLezione_FinalStatic;

public class Persona {
    

    String nome;
    String cognome;
    static int numeroPersone = 0; // Variabile statica per contare il numero di persone create

    //* Costruttore della classe Persona
    Persona(String nome, String cognome) {
        this.nome = nome; // Inizializza l'attributo nome con il valore passato al costruttore
        this.cognome = cognome; // Inizializza l'attributo cognome con il valore passato al costruttore
        numeroPersone++; // Incrementa il contatore delle persone create (Static)
    }

    static void mostraNumeroPersone() {
        // Metodo statico per mostrare il numero di persone create
        System.out.println("Numero di persone create: " + numeroPersone);
    }
}
