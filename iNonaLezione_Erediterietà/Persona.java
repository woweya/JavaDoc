package iNonaLezione_Erediterietà;

public class Persona {
    
    String nome;
    String cognome;
    int eta;
    String citta;

    // Costruttore della classe Persona
    public Persona(String nome, String cognome, int eta, String citta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.citta = citta;
    }

    // Metodo per salutare una persona
    public void saluta() {
        System.out.println("Ciao, sono " + nome + " " + cognome + ", ho " + eta + " anni e vivo a " + citta + ".");
    }

}
