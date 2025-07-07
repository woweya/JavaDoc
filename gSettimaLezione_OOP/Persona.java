package gSettimaLezione_OOP;


// OGGETTO Persona

public class Persona {
    
    String nome = "Mario";

    String cognome = "Rossi";

    int eta = 30;

    String citta = "Roma";
    
    //* Costruttore della classe Persona (si può inserire public/private oppure solamente Persona)
    public Persona(String nome, String cognome, int eta, String citta) {
        this.nome = nome; // Inizializza l'attributo nome con il valore passato al costruttore
        this.cognome = cognome; // Inizializza l'attributo cognome con il valore passato al costruttore
        this.eta = eta; // Inizializza l'attributo eta con il valore passato al costruttore
        this.citta = citta; // Inizializza l'attributo citta con il valore passato al costruttore
    }

    //* Overload Costruttore (si può inserire public/private oppure solamente Persona)
    /** -------------------------------------------------------------------------------- */
    //! Questo costruttore è un esempio di "overloading", 
    //! che consente di avere più costruttori con parametri diversi nella stessa classe.
    //! In Main.java, quando si crea un oggetto Persona,
    //! si può scegliere quale costruttore utilizzare in base ai parametri forniti.
    //! Se passo quindi solo il nome e cognome,
    //! il costruttore con due parametri verrà chiamato, altrimenti se passo tutti i parametri,
    //! verrà chiamato il costruttore con quattro parametri.

        public Persona(String nome, String cognome) {
            this.nome = nome; // Inizializza l'attributo nome con il valore passato al costruttore
            this.cognome = cognome; // Inizializza l'attributo cognome con il valore passato al costruttore

            System.out.println("Costruttore con nome e cognome chiamato!" + nome + cognome); // Messaggio di debug per indicare che il costruttore è stato chiamato
        }

    /** -------------------------------------------------------------------------------- */

    public void saluta() {
        // Metodo per stampare un saluto
        System.out.println("Ciao, mi chiamo " + nome + " " + cognome + ", ho " + eta + " anni e vivo a " + citta + ".");
    }


    public String getNome() {
        return nome; // Restituisce il nome della persona
    }


    public void setNome(String nome) {
        this.nome = nome; // Imposta il nome della persona
    }

    //Metodo con parametro Oggetto
    public void salutaPersone(Persona personaDaSalutare) {
        // Metodo per salutare un'altra persona
        System.out.println("Ciao " + personaDaSalutare.getNome() + ", io sono " + this.nome + ".");
    }


}
