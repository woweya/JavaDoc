package jDecimaLezione_ClassiAstratte;

public class Main {

    public static void main(String[] args) {
        
    //^ In classi astratte non possiamo richiamare direttamente il costruttore della classe astratta.
    /** -------------------------------------------------------------------------------- */

      //! ERRATO:  public Veicolo veicolo = new Veicolo(); //Classe astratta

    /** -------------------------------------------------------------------------------- */

        Macchina macchina = new Macchina("Fiat", "Punto"); //Classe concreta che estende la classe astratta Veicolo


        macchina.guida(); // Chiamata al metodo guida della classe Macchina

        macchina.frena(); // Chiamata al metodo frena della classe Macchina
    }
    
}
