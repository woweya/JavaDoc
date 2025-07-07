package iNonaLezione_Erediterietà;


// Classe Insegnante che estende la classe Persona (Eredità)
public class Insegnante extends Persona {
    
    // Attributo specifico per la classe Insegnante

    private String materia = "Matematica"; // Inizializza l'attributo materia con un valore di default
    //* Attributo specifico per la classe Insegnante, che rappresenta la materia insegnata,
    //* se non viene specificato un valore diverso dal Main.java, allora il valore di default sarà "Matematica".


    //^ Costruttore della classe Insegnante
    Insegnante(String nome, String cognome, int eta, String citta, String materia) {
        super(nome, cognome, eta, citta); //! Chiama il costruttore della classe base Persona. 
        //! Serve per inizializzare gli attributi ereditati.

        this.materia = materia; //! Inizializza l'attributo specifico materia.
    }

    // Metodo specifico per la classe Insegnante
    public void insegna() {
        System.out.println(nome + " " + cognome + " sta insegnando.");
    }


    //^ Override del metodo saluta della classe Persona, ovvero modifica il comportamento del metodo saluta
    //^ per la classe Insegnante, metodo che è ereditato dalla classe Persona.
    @Override
    public void saluta() {
        System.out.println("Ciao, sono " + nome + " " + cognome + ", ho " + eta + " anni, vivo a " + citta + " e sono un insegnante di " + materia + ".");
    }


    public void insegnaA(Studente studente)
    {
        System.out.println(nome + " " + cognome + " sta insegnando a " + studente.nome + " " + studente.cognome + " " + "la materia " + materia + ".");
    }


}
