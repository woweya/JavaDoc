package iNonaLezione_Erediterietà;

public class Main {

    public static void main(String[] args) {
        

        //^ Dichiarazione e inizializzazione di oggetti delle classi Studente e Insegnante
        /** -------------------------------------------------------------------------------- */

        Studente studente1 = new Studente("Giovanni", "Verdi", 20, "Firenze"); // Crea un oggetto Studente
        Insegnante insegnante1 = new Insegnante("Maria", "Rossi", 35, "Roma", "Java"); // Crea un oggetto Insegnante

        /** -------------------------------------------------------------------------------- */

        //^ Utilizzo dei metodi delle classi Studente e Insegnante
        /** -------------------------------------------------------------------------------- */

        studente1.saluta(); // Chiama il metodo saluta della classe Persona (ereditato)
        studente1.studia(); // Chiama il metodo specifico della classe Studente
        //^ NOTA: Si può usare @Override per modificare il comportamento del metodo saluta nella classe Studente.
        

        insegnante1.saluta(); // Chiama il metodo saluta della classe Persona (ereditato)
        //^ NOTA: Si può usare @Override per modificare il comportamento del metodo saluta nella classe Insegnante.


        insegnante1.insegna(); // Chiama il metodo specifico della classe Insegnante


        insegnante1.insegnaA(studente1); // Chiama il metodo insegna con un oggetto Studente come parametro
    }
    
}
