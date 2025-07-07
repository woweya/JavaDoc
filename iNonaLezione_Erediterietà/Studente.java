package iNonaLezione_Erediterietà;


// Classe Studente che estende la classe Persona (Eredità)
public class Studente extends Persona {
    
    //^ Costruttore della classe Studente
    public Studente(String nome, String cognome, int eta, String citta) {
        super(nome, cognome, eta, citta); //! Chiama il costruttore della classe base Persona.
        //! Serve per inizializzare gli attributi ereditati.
    }

    // Metodo specifico per la classe Studente
    public void studia() {
        System.out.println(nome + " " + cognome + " sta studiando.");
    }


    //^ Override del metodo saluta della classe Persona, ovvero modifica il comportamento del metodo saluta
    //^ per la classe Studente, metodo che è ereditato dalla classe Persona.
    @Override
    public void saluta() {
        System.out.println("Ciao, sono " + nome + " " + cognome + ", ho " + eta + " anni, vivo a " + citta + " e sono uno studente.");
    }
}
