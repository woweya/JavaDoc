package jDecimaLezione_ClassiAstratte;


// Classe Macchina che estende la classe Veicolo (Eredità classe Astratta)
public class Macchina extends Veicolo {
    
    private String marca;
    private String modello;

    //^ Costruttore della classe Macchina
    Macchina(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    // Metodo specifico per la classe Macchina
    @Override //Override del metodo guida della classe Veicolo, ovvero modifica il comportamento del metodo guida
    public void guida() {
        System.out.println("Sto guidando una " + marca + " " + modello + ".");
    }

    @Override //Override del metodo frena della classe Veicolo, ovvero modifica il comportamento del metodo frena
    public void frena() {
        System.out.println("Sto frenando la " + marca + " " + modello + ".");
    }

}