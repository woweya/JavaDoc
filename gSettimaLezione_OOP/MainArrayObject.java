package gSettimaLezione_OOP;

public class MainArrayObject {
    

    public static void main(String[] args) {
        
        //^ Dichiarazione e inizializzazione di un array di oggetti Persona
        /** -------------------------------------------------------------------------------- */

        Persona[] persone = new Persona[3]; // Crea un array di oggetti Persona con 3 elementi

        /** ----------------------------- OPPURE ------------------------------- */

        // Persona[] persone = {new Persona(), new Persona(), new Persona()}; // Crea un array di oggetti Persona con 3 elementi

        /** -------------------------------------------------------------------------------- */

        //^ Creazione di oggetti Persona e assegnazione all'array
        /** -------------------------------------------------------------------------------- */

            persone[0] = new Persona("Alice", "Bianchi", 30, "Milano");
            persone[1] = new Persona("Bob", "Verdi", 25, "Torino");
            persone[2] = new Persona("Charlie", "Neri", 35, "Firenze");

        /** -------------------------------------------------------------------------------- */

        //^ Stampa delle informazioni delle persone nell'array
        /** -------------------------------------------------------------------------------- */

            for (Persona p : persone) {
                p.saluta(); // Chiama il metodo saluta per ogni persona nell'array
            }

        /** -------------------------------------------------------------------------------- */       

    }
}
