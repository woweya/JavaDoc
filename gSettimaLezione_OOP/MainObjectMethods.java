package gSettimaLezione_OOP;

public class MainObjectMethods {
    
    public static void main(String[] args) {
        
        //^ Dichiarazione e inizializzazione di un array di oggetti Persona
        /** -------------------------------------------------------------------------------- */

        Persona persona1 = new Persona("Mario", "Rossi", 30, "Roma"); // Crea un oggetto Persona con i dati specificati
        Persona persona2 = new Persona("Alice", "Bianchi", 25, "Milano"); // Crea un altro oggetto Persona
        Persona persona3 = new Persona("Luca", "Verdi", 28, "Torino"); // Crea un terzo oggetto Persona
        

        /** -------------------------------------------------------------------------------- */

        persona1.salutaPersone(persona3);
        persona1.salutaPersone(persona2);
        //Output: Ciao Luca, io sono Mario. "persona1 (Luca)" saluta "persona3 (Mario)". 
        //Output: Ciao Alice, io sono Mario. "persona1 (Luca)" saluta "persona2 (Alice)".
    }
}
