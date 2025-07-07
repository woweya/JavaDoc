package lDodicesimaLezione_Casting;

/**
 * Java 12: Casting
 * 
 * - Casting implicito (automatico)
 * - Casting esplicito (manuale)
 * - Esempi di casting tra tipi primitivi e oggetti
 */

public class Main {
    
    public static void main(String[] args) {
        
        //^ Esempio di casting implicito (automatico)
        int numeroIntero = 10; // Tipo int
        double numeroDouble = numeroIntero; // Casting implicito da int a double
        // In questo caso, il valore di numeroIntero viene convertito automaticamente in double
        
        System.out.println("Numero intero: " + numeroIntero);
        System.out.println("Numero double dopo casting implicito: " + numeroDouble);
        
        //^ Esempio di casting esplicito (manuale)
        double numeroDouble2 = 9.99; // Tipo double
        int numeroIntero2 = (int) numeroDouble2; // Casting esplicito da double a int
        // Se utilizzo (int) numeroDouble2, il valore sarà troncato (9.99 diventa 9)
        
        System.out.println("Numero double: " + numeroDouble2);
        System.out.println("Numero intero dopo casting esplicito: " + numeroIntero2);
        
    }


}
