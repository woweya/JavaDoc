# Documentazione Java - Guida Completa

## Indice
1. [Introduzione](#introduzione)
2. [Variabili e Tipi di Dati](#variabili-e-tipi-di-dati)
3. [Input Utente](#input-utente)
4. [Array e Cicli](#array-e-cicli)
5. [Metodi delle Stringhe](#metodi-delle-stringhe)
6. [Metodi](#metodi)
7. [Programmazione Orientata agli Oggetti](#programmazione-orientata-agli-oggetti)
8. [Final e Static](#final-e-static)
9. [Ereditarietà](#ereditarietà)
10. [Classi Astratte](#classi-astratte)
11. [File I/O](#file-io)
12. [Casting](#casting)
13. [HashMap](#hashmap)
14. [Iterator](#iterator)
15. [Best Practices](#best-practices)

---

## Introduzione

Java è un linguaggio di programmazione ad alto livello che utilizza un processo di compilazione in due fasi:

1. **Source Code** (.java) → **Compiler** → **Bytecode** (.class)
2. **Bytecode** → **JVM** → **Machine Code**

### Componenti Principali
- **JDK (Java Development Kit)**: Kit di sviluppo completo che include compilatore, debugger e strumenti
- **JRE (Java Runtime Environment)**: Ambiente di esecuzione che include JVM e librerie
- **JVM (Java Virtual Machine)**: Macchina virtuale che esegue il bytecode

### Caratteristiche Principali di Java
- **Portabilità**: "Write Once, Run Anywhere" grazie alla JVM
- **Orientato agli Oggetti**: Tutto è un oggetto (tranne i tipi primitivi)
- **Gestione Automatica della Memoria**: Garbage Collection
- **Robustezza**: Controllo degli errori a compile-time e runtime
- **Sicurezza**: Controllo degli accessi e sandboxing

### Primo Programma

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Risultato atteso:**
```
Hello, World!
```

**Spiegazione:**
- `public class Main`: Definisce una classe pubblica chiamata Main
- `public static void main(String[] args)`: Metodo principale, punto di ingresso del programma
- `System.out.println()`: Stampa il testo sulla console e va a capo

---

## Variabili e Tipi di Dati

### Concetti Fondamentali

Le variabili in Java sono contenitori che memorizzano valori di dati. Java è un linguaggio **fortemente tipizzato**, il che significa che ogni variabile deve avere un tipo dichiarato.

### Dichiarazione e Inizializzazione

```java
// Dichiarazione (alloca memoria ma non assegna valore)
int numeroIntero;
double numeroDecimale;
String testo;

// Inizializzazione (assegna valore)
numeroIntero = 10;
numeroDecimale = 3.14;
testo = "Ciao, Java!";

// Dichiarazione e inizializzazione insieme (migliore pratica)
int numero = 20;
```

### Tipi Primitivi

I tipi primitivi sono i mattoni fondamentali per la memorizzazione dei dati:

| Tipo | Dimensione | Range | Valore Default | Esempio |
|------|------------|-------|----------------|---------|
| `boolean` | 1 bit | true/false | false | `boolean isActive = true;` |
| `byte` | 8 bit | -128 a 127 | 0 | `byte b = 127;` |
| `short` | 16 bit | -32,768 a 32,767 | 0 | `short s = 1000;` |
| `int` | 32 bit | -2^31 a 2^31-1 | 0 | `int i = 100000;` |
| `long` | 64 bit | -2^63 a 2^63-1 | 0L | `long l = 100000L;` |
| `float` | 32 bit | ~7 cifre decimali | 0.0f | `float f = 10.5f;` |
| `double` | 64 bit | ~15 cifre decimali | 0.0d | `double d = 20.99;` |
| `char` | 16 bit | 0 a 65,535 (Unicode) | '\u0000' | `char c = 'A';` |

### Tipi Reference

```java
String testo = "Hello, Java!"; // Reference type
String maiuscolo = testo.toUpperCase(); // Chiama metodo
System.out.println(maiuscolo); // Output: HELLO, JAVA!
```

**Differenze chiave:**
- **Primitivi**: Memorizzano il valore direttamente
- **Reference**: Memorizzano l'indirizzo di memoria dell'oggetto

### Esempio Completo

```java
public class TipiDati {
    public static void main(String[] args) {
        // Esempi di tutti i tipi primitivi
        boolean isJavaFun = true;
        byte smallNumber = 127;
        short mediumNumber = 32000;
        int largeNumber = 2000000;
        long veryLargeNumber = 9000000000L;
        float decimal = 3.14f;
        double preciseDecimal = 3.14159265359;
        char letter = 'J';
        
        // Tipo reference
        String language = "Java";
        
        // Stampa tutti i valori
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + mediumNumber);
        System.out.println("Int: " + largeNumber);
        System.out.println("Long: " + veryLargeNumber);
        System.out.println("Float: " + decimal);
        System.out.println("Double: " + preciseDecimal);
        System.out.println("Char: " + letter);
        System.out.println("String: " + language);
    }
}
```

**Risultato atteso:**
```
Boolean: true
Byte: 127
Short: 32000
Int: 2000000
Long: 9000000000
Float: 3.14
Double: 3.14159265359
Char: J
String: Java
```

---

## Input Utente

### Utilizzo della Classe Scanner

La classe `Scanner` è il modo standard per leggere input dall'utente in Java. Deve essere importata dal package `java.util`.

```java
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        
        // IMPORTANTE: Consumare il newline rimasto
        scanner.nextLine(); // Questo previene problemi con la prossima lettura
        
        System.out.print("Inserisci la tua città: ");
        String citta = scanner.nextLine();
        
        System.out.println("Ciao " + nome + ", hai " + eta + " anni e vivi a " + citta + ".");
        
        scanner.close(); // Buona pratica per liberare risorse
    }
}
```

### Metodi Scanner Comuni

| Metodo | Descrizione | Esempio Input | Risultato |
|--------|-------------|---------------|-----------|
| `nextLine()` | Legge intera riga | "Hello World" | "Hello World" |
| `next()` | Legge una parola | "Hello World" | "Hello" |
| `nextInt()` | Legge un intero | "25" | 25 |
| `nextDouble()` | Legge un decimale | "3.14" | 3.14 |
| `nextBoolean()` | Legge un booleano | "true" | true |

**Esempio di esecuzione:**
```
Inserisci il tuo nome: Mario
Inserisci la tua età: 25
Inserisci la tua città: Roma
Ciao Mario, hai 25 anni e vivi a Roma.
```

### Gestione Errori Input

```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputSicuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Inserisci un numero: ");
            int numero = scanner.nextInt();
            System.out.println("Hai inserito: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Errore: Devi inserire un numero valido!");
        }
        
        scanner.close();
    }
}
```

---

## Array e Cicli

### Array Monodimensionali

Gli array sono strutture dati che memorizzano elementi dello stesso tipo in posizioni di memoria contigue.

```java
// Dichiarazione e inizializzazione
int[] numeri = {1, 2, 3, 4, 5}; // Array di 5 elementi
String[] nomi = {"Alice", "Bob", "Charlie"}; // Array di 3 elementi

// Accesso agli elementi (indice inizia da 0)
System.out.println("Primo numero: " + numeri[0]); // Output: 1
System.out.println("Ultimo nome: " + nomi[2]); // Output: Charlie

// Ciclo for tradizionale
for (int i = 0; i < numeri.length; i++) {
    System.out.println("Posizione " + i + ": " + numeri[i]);
}

// Ciclo for-each (enhanced for) - più pulito e sicuro
for (String nome : nomi) {
    System.out.println("Nome: " + nome);
}
```

**Risultato atteso:**
```
Primo numero: 1
Ultimo nome: Charlie
Posizione 0: 1
Posizione 1: 2
Posizione 2: 3
Posizione 3: 4
Posizione 4: 5
Nome: Alice
Nome: Bob
Nome: Charlie
```

### Array Multidimensionali

```java
// Array 2D - rappresenta una matrice
String[][] classi = {
    {"Luca", "Marco", "Anna"},      // Classe 1
    {"Sara", "Giulia", "Matteo"},   // Classe 2
    {"Paolo", "Chiara", "Francesco"} // Classe 3
};

// Accesso diretto
System.out.println("Primo studente della seconda classe: " + classi[1][0]); // Sara

// Iterazione completa
for (int i = 0; i < classi.length; i++) {
    System.out.println("Classe " + (i + 1) + ":");
    for (int j = 0; j < classi[i].length; j++) {
        System.out.println("  " + classi[i][j]);
    }
}

// Metodo alternativo con for-each
for (String[] classe : classi) {
    for (String studente : classe) {
        System.out.print(studente + " ");
    }
    System.out.println();
}
```

**Risultato atteso:**
```
Primo studente della seconda classe: Sara
Classe 1:
  Luca
  Marco
  Anna
Classe 2:
  Sara
  Giulia
  Matteo
Classe 3:
  Paolo
  Chiara
  Francesco
Luca Marco Anna 
Sara Giulia Matteo 
Paolo Chiara Francesco 
```

### ArrayList

Gli `ArrayList` sono array dinamici che possono crescere e rimpicciolire durante l'esecuzione.

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creazione
        ArrayList<String> lista = new ArrayList<>();
        
        // Aggiunta elementi
        lista.add("Alice");
        lista.add("Bob");
        lista.add("Charlie");
        System.out.println("Dopo aggiunta: " + lista);
        
        // Modifica elemento
        lista.set(1, "Robert"); // Cambia "Bob" con "Robert"
        System.out.println("Dopo modifica: " + lista);
        
        // Accesso elemento
        String primo = lista.get(0);
        System.out.println("Primo elemento: " + primo);
        
        // Rimozione
        lista.remove("Charlie");
        System.out.println("Dopo rimozione: " + lista);
        
        // Informazioni
        System.out.println("Dimensione: " + lista.size());
        System.out.println("È vuoto? " + lista.isEmpty());
        
        // Iterazione
        for (String elemento : lista) {
            System.out.println("Elemento: " + elemento);
        }
        
        // Pulizia
        lista.clear();
        System.out.println("Dopo clear: " + lista);
    }
}
```

**Risultato atteso:**
```
Dopo aggiunta: [Alice, Bob, Charlie]
Dopo modifica: [Alice, Robert, Charlie]
Primo elemento: Alice
Dopo rimozione: [Alice, Robert]
Dimensione: 2
È vuoto? false
Elemento: Alice
Elemento: Robert
Dopo clear: []
```

### Confronto Array vs ArrayList

| Caratteristica | Array | ArrayList |
|----------------|-------|-----------|
| **Dimensione** | Fissa | Dinamica |
| **Tipo elementi** | Primitivi e oggetti | Solo oggetti |
| **Prestazioni** | Più veloce | Leggermente più lento |
| **Metodi** | Limitati | Molti metodi utili |
| **Sintassi** | `array[index]` | `list.get(index)` |

---

## Metodi delle Stringhe

### Caratteristiche delle Stringhe

Le stringhe in Java sono **immutabili**: ogni operazione crea una nuova stringa invece di modificare quella esistente.

```java
public class StringMethods {
    public static void main(String[] args) {
        String testo = "Questo è un esempio di stringa Java";
        
        // Informazioni sulla stringa
        System.out.println("Testo originale: " + testo);
        System.out.println("Lunghezza: " + testo.length()); // 35
        System.out.println("Primo carattere: " + testo.charAt(0)); // 'Q'
        System.out.println("Ultimo carattere: " + testo.charAt(testo.length() - 1)); // 'a'
        
        // Ricerca
        System.out.println("Contiene 'Java': " + testo.contains("Java")); // true
        System.out.println("Indice di 'Java': " + testo.indexOf("Java")); // 31
        System.out.println("Inizia con 'Questo': " + testo.startsWith("Questo")); // true
        System.out.println("Finisce con 'Java': " + testo.endsWith("Java")); // true
        
        // Modifica (creano nuove stringhe)
        System.out.println("Maiuscolo: " + testo.toUpperCase());
        System.out.println("Minuscolo: " + testo.toLowerCase());
        System.out.println("Sostituisce 'Java' con 'Python': " + testo.replace("Java", "Python"));
        
        // Estrazione
        System.out.println("Primi 6 caratteri: " + testo.substring(0, 6)); // "Questo"
        System.out.println("Dal carattere 7: " + testo.substring(7)); // "è un esempio di stringa Java"
        
        // Gestione spazi
        String testoConSpazi = "   Hello World   ";
        System.out.println("Con spazi: '" + testoConSpazi + "'");
        System.out.println("Senza spazi: '" + testoConSpazi.trim() + "'");
        
        // Confronto
        String str1 = "Java";
        String str2 = "java";
        System.out.println("'Java' equals 'java': " + str1.equals(str2)); // false
        System.out.println("'Java' equalsIgnoreCase 'java': " + str1.equalsIgnoreCase(str2)); // true
        
        // Controllo vuoto
        String vuota = "";
        String nulla = null;
        System.out.println("Stringa vuota isEmpty(): " + vuota.isEmpty()); // true
        System.out.println("Stringa vuota isBlank(): " + vuota.isBlank()); // true (Java 11+)
        
        // Divisione
        String frase = "apple,banana,cherry";
        String[] frutti = frase.split(",");
        System.out.println("Frutti divisi:");
        for (String frutto : frutti) {
            System.out.println("- " + frutto);
        }
    }
}
```

**Risultato atteso:**
```
Testo originale: Questo è un esempio di stringa Java
Lunghezza: 35
Primo carattere: Q
Ultimo carattere: a
Contiene 'Java': true
Indice di 'Java': 31
Inizia con 'Questo': true
Finisce con 'Java': true
Maiuscolo: QUESTO È UN ESEMPIO DI STRINGA JAVA
Minuscolo: questo è un esempio di stringa java
Sostituisce 'Java' con 'Python': Questo è un esempio di stringa Python
Primi 6 caratteri: Questo
Dal carattere 7: è un esempio di stringa Java
Con spazi: '   Hello World   '
Senza spazi: 'Hello World'
'Java' equals 'java': false
'Java' equalsIgnoreCase 'java': true
Stringa vuota isEmpty(): true
Stringa vuota isBlank(): true
Frutti divisi:
- apple
- banana
- cherry
```

### StringBuilder per Prestazioni

Quando si fanno molte concatenazioni, usare `StringBuilder`:

```java
public class StringBuilderExample {
    public static void main(String[] args) {
        // Inefficiente con String normale
        String risultato = "";
        for (int i = 0; i < 1000; i++) {
            risultato += "a"; // Crea 1000 oggetti String!
        }
        
        // Efficiente con StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("a"); // Modifica lo stesso oggetto
        }
        String risultatoEfficiente = sb.toString();
        
        System.out.println("Lunghezza risultato: " + risultatoEfficiente.length()); // 1000
    }
}
```

---

## Metodi

### Anatomia di un Metodo

```java
[modificatori] tipoRitorno nomeMetodo([parametri]) {
    // corpo del metodo
    [return valore;] // opzionale per void
}
```

### Definizione e Utilizzo

```java
public class MetodiExample {
    public static void main(String[] args) {
        // Chiamata metodi
        int risultato = somma(5, 10);
        System.out.println("5 + 10 = " + risultato); // 15
        
        stampaMessaggio("Ciao da Java!");
        
        double media = calcolaMedia(8.5, 9.0, 7.5);
        System.out.println("Media: " + media); // 8.333333333333334
    }
    
    // Metodo con ritorno
    public static int somma(int a, int b) {
        return a + b;
    }
    
    // Metodo void (senza ritorno)
    public static void stampaMessaggio(String messaggio) {
        System.out.println("Messaggio: " + messaggio);
    }
    
    // Metodo con più parametri
    public static double calcolaMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
```

**Risultato atteso:**
```
5 + 10 = 15
Messaggio: Ciao da Java!
Media: 8.333333333333334
```

### Overloading dei Metodi

L'overloading permette di avere più metodi con lo stesso nome ma parametri diversi:

```java
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Somma int: " + somma(5, 10)); // 15
        System.out.println("Somma tre int: " + somma(5, 10, 15)); // 30
        System.out.println("Somma double: " + somma(5.5, 10.5)); // 16.0
        System.out.println("Somma stringhe: " + somma("Hello", "World")); // HelloWorld
    }
    
    // Overload 1: due interi
    public static int somma(int a, int b) {
        return a + b;
    }
    
    // Overload 2: tre interi
    public static int somma(int a, int b, int c) {
        return a + b + c;
    }
    
    // Overload 3: due double
    public static double somma(double a, double b) {
        return a + b;
    }
    
    // Overload 4: due stringhe
    public static String somma(String a, String b) {
        return a + b;
    }
}
```

### Scope delle Variabili

```java
public class VariableScope {
    static int variabileClasse = 100; // Variabile di classe
    
    public static void main(String[] args) {
        int variabileMain = 50; // Variabile locale al main
        
        System.out.println("Variabile classe: " + variabileClasse); // 100
        System.out.println("Variabile main: " + variabileMain); // 50
        
        metodoEsempio();
        
        // System.out.println(variabileMetodo); // ERRORE! Non accessibile
    }
    
    public static void metodoEsempio() {
        int variabileMetodo = 25; // Variabile locale al metodo
        System.out.println("Variabile metodo: " + variabileMetodo); // 25
        System.out.println("Variabile classe dal metodo: " + variabileClasse); // 100
    }
}
```

---

## Programmazione Orientata agli Oggetti

### Principi Fondamentali dell'OOP

1. **Incapsulamento**: Nascondere i dettagli di implementazione
2. **Ereditarietà**: Riutilizzo del codice attraverso l'ereditarietà
3. **Polimorfismo**: Stesso metodo, comportamenti diversi
4. **Astrazione**: Semplificare sistemi complessi

### Definizione di una Classe

```java
public class Persona {
    // Attributi (campi) - private per incapsulamento
    private String nome;
    private String cognome;
    private int eta;
    private String citta;
    
    // Costruttore principale
    public Persona(String nome, String cognome, int eta, String citta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.citta = citta;
    }
    
    // Costruttore overloaded
    public Persona(String nome, String cognome) {
        this(nome, cognome, 0, "Non specificata"); // Chiamata al costruttore principale
    }
    
    // Metodi
    public void saluta() {
        System.out.println("Ciao, mi chiamo " + nome + " " + cognome);
    }
    
    public void presentati() {
        System.out.println("Sono " + nome + " " + cognome + 
                          ", ho " + eta + " anni e vivo a " + citta);
    }
    
    // Getter e Setter (incapsulamento)
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome non valido!");
        }
    }
    
    public int getEta() {
        return eta;
    }
    
    public void setEta(int eta) {
        if (eta >= 0 && eta <= 120) {
            this.eta = eta;
        } else {
            System.out.println("Età non valida!");
        }
    }
    
    // Metodo con parametro oggetto
    public void salutaPersona(Persona altra) {
        System.out.println("Ciao " + altra.getNome() + ", io sono " + this.nome);
    }
    
    // Override del metodo toString
    @Override
    public String toString() {
        return "Persona{nome='" + nome + "', cognome='" + cognome + 
               "', eta=" + eta + ", citta='" + citta + "'}";
    }
}
```

### Utilizzo della Classe

```java
public class Main {
    public static void main(String[] args) {
        // Creazione oggetti
        Persona persona1 = new Persona("Mario", "Rossi", 30, "Roma");
        Persona persona2 = new Persona("Alice", "Bianchi", 25, "Milano");
        Persona persona3 = new Persona("Luca", "Verdi"); // Costruttore overloaded
        
        // Utilizzo metodi
        persona1.saluta();
        persona1.presentati();
        
        persona2.saluta();
        persona2.presentati();
        
        persona3.saluta();
        persona3.presentati();
        
        // Interazione tra oggetti
        persona1.salutaPersona(persona2);
        
        // Utilizzo getter e setter
        System.out.println("Nome persona1: " + persona1.getNome());
        persona1.setEta(31);
        System.out.println("Nuova età: " + persona1.getEta());
        
        // Array di oggetti
        Persona[] persone = {persona1, persona2, persona3};
        System.out.println("\nTutte le persone:");
        for (Persona p : persone) {
            System.out.println(p.toString());
        }
    }
}
```

**Risultato atteso:**
```
Ciao, mi chiamo Mario Rossi
Sono Mario Rossi, ho 30 anni e vivo a Roma
Ciao, mi chiamo Alice Bianchi
Sono Alice Bianchi, ho 25 anni e vivo a Milano
Ciao, mi chiamo Luca Verdi
Sono Luca Verdi, ho 0 anni e vivo a Non specificata
Ciao Alice, io sono Mario
Nome persona1: Mario
Nuova età: 31

Tutte le persone:
Persona{nome='Mario', cognome='Rossi', eta=31, citta='Roma'}
Persona{nome='Alice', cognome='Bianchi', eta=25, citta='Milano'}
Persona{nome='Luca', cognome='Verdi', eta=0, citta='Non specificata'}
```

### Vantaggi dell'OOP

1. **Riutilizzo del codice**: Le classi possono essere riutilizzate
2. **Manutenibilità**: Codice più facile da mantenere e modificare
3. **Scalabilità**: Facilita l'aggiunta di nuove funzionalità
4. **Sicurezza**: Incapsulamento protegge i dati
5. **Modularità**: Codice organizzato in moduli logici

---

## Final e Static

### Parola Chiave Final

`final` può essere applicato a variabili, metodi e classi:

```java
public class FinalExample {
    // Costante di classe
    public static final double PI = 3.14159;
    public static final String NOME_APPLICAZIONE = "MyApp";
    
    public static void main(String[] args) {
        // Variabile finale locale
        final int NUMERO_MASSIMO = 100;
        System.out.println("Numero massimo: " + NUMERO_MASSIMO);
        
        // NUMERO_MASSIMO = 200; // ERRORE! Non può essere modificato
        
        // Array finale (il riferimento è finale, non il contenuto)
        final int[] numeri = {1, 2, 3, 4, 5};
        numeri[0] = 10; // OK - modifica il contenuto
        System.out.println("Primo numero modificato: " + numeri[0]); // 10
        
        // numeri = new int[]{6, 7, 8}; // ERRORE! Non può riassegnare
        
        // Utilizzo costanti
        System.out.println("Pi greco: " + PI);
        System.out.println("Nome app: " + NOME_APPLICAZIONE);
    }
}
```

### Parola Chiave Static

`static` significa che appartiene alla classe, non all'istanza:

```java
public class StaticExample {
    // Variabile statica - condivisa tra tutte le istanze
    private static int contatore = 0;
    
    // Variabile di istanza
    private String nome;
    
    // Costruttore
    public StaticExample(String nome) {
        this.nome = nome;
        contatore++; // Incrementa per ogni istanza creata
    }
    
    // Metodo statico
    public static int getContatore() {
        return contatore;
    }
    
    // Metodo statico con logica
    public static void resetContatore() {
        contatore = 0;
        System.out.println("Contatore resettato!");
    }
    
    // Metodo di istanza
    public void saluta() {
        System.out.println("Ciao, sono " + nome + " (istanza #" + contatore + ")");
    }
    
    // Metodo statico main
    public static void main(String[] args) {
        System.out.println("Contatore iniziale: " + StaticExample.getContatore()); // 0
        
        StaticExample obj1 = new StaticExample("Mario");
        StaticExample obj2 = new StaticExample("Alice");
        StaticExample obj3 = new StaticExample("Luca");
        
        obj1.saluta();
        obj2.saluta();
        obj3.saluta();
        
        System.out.println("Contatore finale: " + StaticExample.getContatore()); // 3
        
        StaticExample.resetContatore();
        System.out.println("Contatore dopo reset: " + StaticExample.getContatore()); // 0
    }
}
```

**Risultato atteso:**
```
Contatore iniziale: 0
Ciao, sono Mario (istanza #1)
Ciao, sono Alice (istanza #2)
Ciao, sono Luca (istanza #3)
Contatore finale: 3
Contatore resettato!
Contatore dopo reset: 0
```

### Utilizzo Pratico di Static

```java
public class MathUtils {
    // Costanti
    public static final double PI = 3.14159;
    public static final double E = 2.71828;
    
    // Metodi di utilità
    public static double calcolaAreaCerchio(double raggio) {
        return PI * raggio * raggio;
    }
    
    public static int massimo(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static int minimo(int a, int b) {
        return (a < b) ? a : b;
    }
    
    // Metodo main per test
    public static void main(String[] args) {
        double area = MathUtils.calcolaAreaCerchio(5.0);
        System.out.println("Area cerchio con raggio 5: " + area); // 78.53975
        
        int max = MathUtils.massimo(10, 20);
        System.out.println("Massimo tra 10 e 20: " + max); // 20
        
        int min = MathUtils.minimo(10, 20);
        System.out.println("Minimo tra 10 e 20: " + min); // 10
    }
}
```

---

## Ereditarietà

### Concetti Base

L'ereditarietà permette di creare nuove classi basate su classi esistenti, promuovendo il riutilizzo del codice.

### Classe Base (Superclasse)

```java
public class Persona {
    protected String nome;    // protected: accessibile alle sottoclassi
    protected String cognome;
    protected int eta;
    protected String citta;
    
    // Costruttore
    public Persona(String nome, String cognome, int eta, String citta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.citta = citta;
        System.out.println("Costruttore Persona chiamato per " + nome);
    }
    
    // Metodi
    public void saluta() {
        System.out.println("Ciao, sono " + nome + " " + cognome);
    }
    
    public void presentati() {
        System.out.println("Mi chiamo " + nome + " " + cognome + 
                          ", ho " + eta + " anni e vivo a " + citta);
    }
    
    // Getters
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public int getEta() { return eta; }
    public String getCitta() { return citta; }
}
```

### Classe Derivata (Sottoclasse)

```java
public class Studente extends Persona {
    private String corso;
    private double media;
    
    // Costruttore
    public Studente(String nome, String cognome, int eta, String citta, String corso) {
        super(nome, cognome, eta, citta); // Chiama costruttore della superclasse
        this.corso = corso;
        this.media = 0.0;
        System.out.println("Costruttore Studente chiamato per " + nome);
    }
    
    // Metodi specifici della sottoclasse
    public void studia() {
        System.out.println(nome + " sta studiando " + corso);
    }
    
    public void sostieniEsame(double voto) {
        if (voto >= 18 && voto <= 30) {
            media = (media + voto) / 2; // Semplificazione
            System.out.println(nome + " ha preso " + voto + " nell'esame!");
        } else {
            System.out.println("Voto non valido!");
        }
    }
    
    // Override del metodo della superclasse
    @Override
    public void presentati() {
        super.presentati(); // Chiama metodo della superclasse
        System.out.println("Studio " + corso + " e ho una media di " + media);
    }
    
    // Override del metodo saluta
    @Override
    public void saluta() {
        System.out.println("Ciao, sono " + nome + " " + cognome + 
                          ", sono uno studente di " + corso);
    }
    
    // Getters specifici
    public String getCorso() { return corso; }
    public double getMedia() { return media; }
}
```

### Altra Classe Derivata

```java
public class Insegnante extends Persona {
    private String materia;
    private int anniEsperienza;
    
    public Insegnante(String nome, String cognome, int eta, String citta, String materia) {
        super(nome, cognome, eta, citta);
        this.materia = materia;
        this.anniEsperienza = 0;
        System.out.println("Costruttore Insegnante chiamato per " + nome);
    }
    
    public void insegna() {
        System.out.println(nome + " sta insegnando " + materia);
    }
    
    public void valutaStudente(Studente studente, double voto) {
        System.out.println(nome + " ha dato " + voto + " a " + studente.getNome());
        studente.sostieniEsame(voto);
    }
    
    @Override
    public void presentati() {
        super.presentati();
        System.out.println("Insegno " + materia + " da " + anniEsperienza + " anni");
    }
    
    @Override
    public void saluta() {
        System.out.println("Salve, sono il professore " + nome + " " + cognome + 
                          " di " + materia);
    }
    
    // Getters
    public String getMateria() { return materia; }
    public int getAnniEsperienza() { return anniEsperienza; }
}
```

### Utilizzo dell'Ereditarietà

```java
public class EreditarietaMain {
    public static void main(String[] args) {
        // Creazione oggetti
        Persona persona = new Persona("Mario", "Rossi", 45, "Roma");
        Studente studente = new Studente("Alice", "Bianchi", 20, "Milano", "Informatica");
        Insegnante insegnante = new Insegnante("Prof. Verdi", "Giuseppe", 50, "Torino", "Matematica");
        
        System.out.println("\n=== SALUTI ===");
        persona.saluta();
        studente.saluta();
        insegnante.saluta();
        
        System.out.println("\n=== PRESENTAZIONI ===");
        persona.presentati();
        studente.presentati();
        insegnante.presentati();
        
        System.out.println("\n=== AZIONI SPECIFICHE ===");
        studente.studia();
        insegnante.insegna();
        insegnante.valutaStudente(studente, 28.5);
        
        System.out.println("\n=== DOPO ESAME ===");
        studente.presentati();
        
        // Polimorfismo
        System.out.println("\n=== POLIMORFISMO ===");
        Persona[] persone = {persona, studente, insegnante};
        for (Persona p : persone) {
            p.saluta(); // Chiama il metodo appropriato per ogni tipo
        }
    }
}
```

**Risultato atteso:**
```
Costruttore Persona chiamato per Mario
Costruttore Persona chiamato per Alice
Costruttore Studente chiamato per Alice
Costruttore Persona chiamato per Prof. Verdi
Costruttore Insegnante chiamato per Prof. Verdi

=== SALUTI ===
Ciao, sono Mario Rossi
Ciao, sono Alice Bianchi, sono uno studente di Informatica
Salve, sono il professore Prof. Verdi Giuseppe di Matematica

=== PRESENTAZIONI ===
Mi chiamo Mario Rossi, ho 45 anni e vivo a Roma
Mi chiamo Alice Bianchi, ho 20 anni e vivo a Milano
Studio Informatica e ho una media di 0.0
Mi chiamo Prof. Verdi Giuseppe, ho 50 anni e vivo a Torino
Insegno Matematica da 0 anni

=== AZIONI SPECIFICHE ===
Alice sta studiando Informatica
Prof. Verdi sta insegnando Matematica
Prof. Verdi ha dato 28.5 a Alice
Alice ha preso 28.5 nell'esame!

=== DOPO ESAME ===
Mi chiamo Alice Bianchi, ho 20 anni e vivo a Milano
Studio Informatica e ho una media di 14.25

=== POLIMORFISMO ===
Ciao, sono Mario Rossi
Ciao, sono Alice Bianchi, sono uno studente di Informatica
Salve, sono il professore Prof. Verdi Giuseppe di Matematica
```

---

## Classi Astratte

### Concetti Base

Le classi astratte sono classi che non possono essere istanziate direttamente. Servono come modelli per altre classi.

### Definizione Classe Astratta

```java
public abstract class Veicolo {
    // Attributi comuni
    protected String marca;
    protected String modello;
    protected int anno;
    protected boolean acceso;
    
    // Costruttore
    public Veicolo(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.acceso = false;
        System.out.println("Veicolo creato: " + marca + " " + modello);
    }
    
    // Metodi concreti (implementati)
    public void accendi() {
        if (!acceso) {
            acceso = true;
            System.out.println(marca + " " + modello + " è stato acceso");
        } else {
            System.out.println(marca + " " + modello + " è già acceso");
        }
    }
    
    public void spegni() {
        if (acceso) {
            acceso = false;
            System.out.println(marca + " " + modello + " è stato spento");
        } else {
            System.out.println(marca + " " + modello + " è già spento");
        }
    }
    
    public void mostraInfo() {
        System.out.println("Veicolo: " + marca + " " + modello + " (" + anno + ")");
        System.out.println("Stato: " + (acceso ? "Acceso" : "Spento"));
    }
    
    // Metodi astratti (devono essere implementati nelle sottoclassi)
    public abstract void guida();
    public abstract void frena();
    public abstract void suonaClacson();
    public abstract String getTipoVeicolo();
}
```

### Implementazioni Concrete

```java
public class Auto extends Veicolo {
    private int numeroPosti;
    private String tipoCarburante;
    
    public Auto(String marca, String modello, int anno, int numeroPosti, String tipoCarburante) {
        super(marca, modello, anno);
        this.numeroPosti = numeroPosti;
        this.tipoCarburante = tipoCarburante;
        System.out.println("Auto creata con " + numeroPosti + " posti");
    }
    
    @Override
    public void guida() {
        if (acceso) {
            System.out.println("Sto guidando l'auto " + marca + " " + modello + 
                             " con " + numeroPosti + " posti");
        } else {
            System.out.println("Prima devi accendere l'auto!");
        }
    }
    
    @Override
    public void frena() {
        System.out.println("Sto frenando l'auto " + marca + " " + modello + 
                          " usando i freni a disco");
    }
    
    @Override
    public void suonaClacson() {
        System.out.println("BEEP BEEP! (clacson dell'auto)");
    }
    
    @Override
    public String getTipoVeicolo() {
        return "Auto";
    }
    
    // Metodo specifico dell'auto
    public void apriPorte() {
        System.out.println("Porte dell'auto aperte");
    }
}

public class Moto extends Veicolo {
    private int cilindrata;
    private boolean hasSidecar;
    
    public Moto(String marca, String modello, int anno, int cilindrata, boolean hasSidecar) {
        super(marca, modello, anno);
        this.cilindrata = cilindrata;
        this.hasSidecar = hasSidecar;
        System.out.println("Moto creata con cilindrata " + cilindrata + "cc");
    }
    
    @Override
    public void guida() {
        if (acceso) {
            System.out.println("Sto guidando la moto " + marca + " " + modello + 
                             " da " + cilindrata + "cc");
        } else {
            System.out.println("Prima devi accendere la moto!");
        }
    }
    
    @Override
    public void frena() {
        System.out.println("Sto frenando la moto " + marca + " " + modello + 
                          " usando freni anteriori e posteriori");
    }
    
    @Override
    public void suonaClacson() {
        System.out.println("BEEP! (clacson della moto)");
    }
    
    @Override
    public String getTipoVeicolo() {
        return "Moto";
    }
    
    // Metodo specifico della moto
    public void impennata() {
        if (acceso) {
            System.out.println("Facendo un'impennata con la " + marca + " " + modello + "!");
        } else {
            System.out.println("Non posso fare un'impennata con la moto spenta!");
        }
    }
}
```

### Utilizzo delle Classi Astratte

```java
public class ClassiAstratteMain {
    public static void main(String[] args) {
        // Veicolo veicolo = new Veicolo("Generic", "Model", 2023); // ERRORE!
        // Le classi astratte non possono essere istanziate
        
        // Creazione di istanze concrete
        Auto auto = new Auto("Fiat", "Punto", 2020, 5, "Benzina");
        Moto moto = new Moto("Honda", "CBR600", 2021, 600, false);
        
        System.out.println("\n=== INFORMAZIONI VEICOLI ===");
        auto.mostraInfo();
        moto.mostraInfo();
        
        System.out.println("\n=== ACCENSIONE ===");
        auto.accendi();
        moto.accendi();
        
        System.out.println("\n=== GUIDA ===");
        auto.guida();
        moto.guida();
        
        System.out.println("\n=== CLACSON ===");
        auto.suonaClacson();
        moto.suonaClacson();
        
        System.out.println("\n=== FRENATA ===");
        auto.frena();
        moto.frena();
        
        System.out.println("\n=== AZIONI SPECIFICHE ===");
        auto.apriPorte();
        moto.impennata();
        
        System.out.println("\n=== POLIMORFISMO CON CLASSI ASTRATTE ===");
        Veicolo[] veicoli = {auto, moto};
        for (Veicolo v : veicoli) {
            System.out.println("Tipo: " + v.getTipoVeicolo());
            v.guida();
            v.suonaClacson();
            System.out.println("---");
        }
        
        System.out.println("\n=== SPEGNIMENTO ===");
        auto.spegni();
        moto.spegni();
    }
}
```

**Risultato atteso:**
```
Veicolo creato: Fiat Punto
Auto creata con 5 posti
Veicolo creato: Honda CBR600
Moto creata con cilindrata 600cc

=== INFORMAZIONI VEICOLI ===
Veicolo: Fiat Punto (2020)
Stato: Spento
Veicolo: Honda CBR600 (2021)
Stato: Spento

=== ACCENSIONE ===
Fiat Punto è stato acceso
Honda CBR600 è stato acceso

=== GUIDA ===
Sto guidando l'auto Fiat Punto con 5 posti
Sto guidando la moto Honda CBR600 da 600cc

=== CLACSON ===
BEEP BEEP! (clacson dell'auto)
BEEP! (clacson della moto)

=== FRENATA ===
Sto frenando l'auto Fiat Punto usando i freni a disco
Sto frenando la moto Honda CBR600 usando freni anteriori e posteriori

=== AZIONI SPECIFICHE ===
Porte dell'auto aperte
Facendo un'impennata con la Honda CBR600!

=== POLIMORFISMO CON CLASSI ASTRATTE ===
Tipo: Auto
Sto guidando l'auto Fiat Punto con 5 posti
BEEP BEEP! (clacson dell'auto)
---
Tipo: Moto
Sto guidando la moto Honda CBR600 da 600cc
BEEP! (clacson della moto)
---

=== SPEGNIMENTO ===
Fiat Punto è stato spento
Honda CBR600 è stato spento
```

---

## File I/O

### Concetti Base

Java fornisce diverse classi per lavorare con i file. Le operazioni principali includono:
- Verifica dell'esistenza di file/directory
- Lettura da file
- Scrittura su file
- Gestione delle eccezioni

### Verifica Esistenza File

```java
import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        // Creazione oggetto File
        File file = new File("esempio.txt");
        File directory = new File("cartella");
        
        System.out.println("=== INFORMAZIONI FILE ===");
        if (file.exists()) {
            System.out.println("✓ Il file esiste");
            System.out.println("Nome: " + file.getName());
            System.out.println("Percorso assoluto: " + file.getAbsolutePath());
            System.out.println("Percorso relativo: " + file.getPath());
            System.out.println("Dimensione: " + file.length() + " byte");
            System.out.println("È un file: " + file.isFile());
            System.out.println("È una directory: " + file.isDirectory());
            System.out.println("È leggibile: " + file.canRead());
            System.out.println("È scrivibile: " + file.canWrite());
            System.out.println("È eseguibile: " + file.canExecute());
        } else {
            System.out.println("✗ Il file non esiste");
        }
        
        System.out.println("\n=== INFORMAZIONI DIRECTORY ===");
        if (directory.exists()) {
            System.out.println("✓ La directory esiste");
            if (directory.isDirectory()) {
                String[] files = directory.list();
                System.out.println("Contiene " + files.length + " elementi:");
                for (String fileName : files) {
                    System.out.println("  - " + fileName);
                }
            }
        } else {
            System.out.println("✗ La directory non esiste");
            System.out.println("Tentativo di crearla...");
            if (directory.mkdir()) {
                System.out.println("✓ Directory creata con successo");
            } else {
                System.out.println("✗ Impossibile creare la directory");
            }
        }
    }
}
```

### Scrittura File

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String nomeFile = "esempio.txt";
        
        try {
            // Modalità sovrascrittura (false o omesso)
            FileWriter writer = new FileWriter(nomeFile, false);
            
            writer.write("=== ESEMPIO DI SCRITTURA FILE ===\n");
            writer.write("Questa è la prima riga\n");
            writer.write("Questa è la seconda riga\n");
            writer.write("Numero: " + 42 + "\n");
            writer.write("Data: " + java.time.LocalDate.now() + "\n");
            
            writer.close();
            System.out.println("✓ File scritto con successo (modalità sovrascrittura)");
            
            // Modalità append (true)
            FileWriter appender = new FileWriter(nomeFile, true);
            appender.write("\n=== CONTENUTO AGGIUNTIVO ===\n");
            appender.write("Questa riga è stata aggiunta\n");
            appender.write("Timestamp: " + java.time.LocalDateTime.now() + "\n");
            
            appender.close();
            System.out.println("✓ Contenuto aggiunto con successo (modalità append)");
            
        } catch (IOException e) {
            System.err.println("✗ Errore durante la scrittura: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```

### Lettura File

```java
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String nomeFile = "esempio.txt";
        
        // Metodo 1: Lettura carattere per carattere
        System.out.println("=== LETTURA CARATTERE PER CARATTERE ===");
        try (FileReader reader = new FileReader(nomeFile)) {
            int carattere;
            while ((carattere = reader.read()) != -1) {
                System.out.print((char) carattere);
            }
        } catch (IOException e) {
            System.err.println("✗ Errore durante la lettura: " + e.getMessage());
        }
        
        // Metodo 2: Lettura riga per riga (più efficiente)
        System.out.println("\n\n=== LETTURA RIGA PER RIGA ===");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeFile))) {
            String riga;
            int numeroRiga = 1;
            
            while ((riga = bufferedReader.readLine()) != null) {
                System.out.println(numeroRiga + ": " + riga);
                numeroRiga++;
            }
        } catch (IOException e) {
            System.err.println("✗ Errore durante la lettura: " + e.getMessage());
        }
        
        // Metodo 3: Lettura completa del file
        System.out.println("\n=== INFORMAZIONI FILE ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeFile))) {
            long numeroRighe = reader.lines().count();
            System.out.println("Numero totale di righe: " + numeroRighe);
        } catch (IOException e) {
            System.err.println("✗ Errore durante il conteggio: " + e.getMessage());
        }
    }
}
```

### Gestione Completa dei File

```java
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private String nomeFile;
    
    public FileManager(String nomeFile) {
        this.nomeFile = nomeFile;
    }
    
    // Scrive lista di stringhe nel file
    public void scriviRighe(List<String> righe) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeFile))) {
            for (String riga : righe) {
                writer.println(riga);
            }
            System.out.println("✓ " + righe.size() + " righe scritte nel file");
        } catch (IOException e) {
            System.err.println("✗ Errore scrittura: " + e.getMessage());
        }
    }
    
    // Legge tutte le righe dal file
    public List<String> leggiRighe() {
        List<String> righe = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeFile))) {
            String riga;
            while ((riga = reader.readLine()) != null) {
                righe.add(riga);
            }
            System.out.println("✓ " + righe.size() + " righe lette dal file");
        } catch (IOException e) {
            System.err.println("✗ Errore lettura: " + e.getMessage());
        }
        
        return righe;
    }
    
    // Aggiunge una riga al file
    public void aggiungiRiga(String riga) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeFile, true))) {
            writer.println(riga);
            System.out.println("✓ Riga aggiunta: " + riga);
        } catch (IOException e) {
            System.err.println("✗ Errore aggiunta: " + e.getMessage());
        }
    }
    
    // Elimina il file
    public void eliminaFile() {
        File file = new File(nomeFile);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("✓ File eliminato: " + nomeFile);
            } else {
                System.out.println("✗ Impossibile eliminare il file: " + nomeFile);
            }
        } else {
            System.out.println("✗ File non esistente: " + nomeFile);
        }
    }
    
    public static void main(String[] args) {
        FileManager fm = new FileManager("test.txt");
        
        // Creazione dati di test
        List<String> righeTest = new ArrayList<>();
        righeTest.add("Prima riga di test");
        righeTest.add("Seconda riga di test");
        righeTest.add("Terza riga con numero: " + 123);
        righeTest.add("Quarta riga con data: " + java.time.LocalDate.now());
        
        // Scrittura
        fm.scriviRighe(righeTest);
        
        // Lettura
        List<String> righeFile = fm.leggiRighe();
        System.out.println("\nContenuto letto:");
        for (int i = 0; i < righeFile.size(); i++) {
            System.out.println((i + 1) + ". " + righeFile.get(i));
        }
        
        // Aggiunta
        fm.aggiungiRiga("Riga aggiunta successivamente");
        
        // Lettura finale
        List<String> righeFinali = fm.leggiRighe();
        System.out.println("\nContenuto finale (" + righeFinali.size() + " righe):");
        righeFinali.forEach(System.out::println);
        
        // Eliminazione (opzionale)
        // fm.eliminaFile();
    }
}
```

**Risultato atteso:**
```
✓ 4 righe scritte nel file
✓ 4 righe lette dal file

Contenuto letto:
1. Prima riga di test
2. Seconda riga di test
3. Terza riga con numero: 123
4. Quarta riga con data: 2024-01-15

✓ Riga aggiunta: Riga aggiunta successivamente
✓ 5 righe lette dal file

Contenuto finale (5 righe):
Prima riga di test
Seconda riga di test
Terza riga con numero: 123
Quarta riga con data: 2024-01-15
Riga aggiunta successivamente
```

---

## Casting

### Concetti Base

Il casting è la conversione di un tipo di dato in un altro. In Java esistono due tipi principali:
- **Casting implicito (Widening)**: Automatico, da tipo più piccolo a più grande
- **Casting esplicito (Narrowing)**: Manuale, da tipo più grande a più piccolo

### Casting Implicito (Widening)

```java
public class CastingImplicito {
    public static void main(String[] args) {
        // Casting automatico tra tipi numerici
        byte byteValue = 10;
        short shortValue = byteValue;    // byte -> short
        int intValue = shortValue;       // short -> int  
        long longValue = intValue;       // int -> long
        float floatValue = longValue;    // long -> float
        double doubleValue = floatValue; // float -> double
        
        System.out.println("Casting implicito:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
    }
}
```

**Risultato atteso:**
```
Casting implicito:
byte: 10
short: 10
int: 10
long: 10
float: 10.0
double: 10.0
```

### Casting Esplicito (Narrowing)

```java
public class CastingEsplicito {
    public static void main(String[] args) {
        // Casting esplicito - richiede conversione manuale
        double numeroDouble = 9.99;
        int numeroIntero = (int) numeroDouble; // Casting esplicito da double a int
        // Il valore viene troncato (9.99 diventa 9)
        
        long numeroLong = 100L;
        int numeroInt = (int) numeroLong; // long -> int
        
        float numeroFloat = 3.14f;
        int numeroInt2 = (int) numeroFloat; // float -> int
        
        System.out.println("Casting esplicito:");
        System.out.println("double: " + numeroDouble);
        System.out.println("int da double: " + numeroIntero);
        System.out.println("long: " + numeroLong);
        System.out.println("int da long: " + numeroInt);
        System.out.println("float: " + numeroFloat);
        System.out.println("int da float: " + numeroInt2);
    }
}
```

**Risultato atteso:**
```
Casting esplicito:
double: 9.99
int da double: 9
long: 100
int da long: 100
float: 3.14
int da float: 3
```

### Casting con Oggetti (Upcasting e Downcasting)

```java
// Utilizzando le classi dall'ereditarietà
public class CastingOggetti {
    public static void main(String[] args) {
        // Upcasting (implicito) - da sottoclasse a superclasse
        Studente studente = new Studente("Mario", "Rossi", 20, "Roma", "Informatica");
        Persona persona = studente; // Upcasting implicito
        
        // Downcasting (esplicito) - da superclasse a sottoclasse
        Persona persona2 = new Studente("Alice", "Bianchi", 22, "Milano", "Matematica");
        Studente studente2 = (Studente) persona2; // Downcasting esplicito
        
        // Verifica del tipo con instanceof
        if (persona instanceof Studente) {
            Studente studenteTemp = (Studente) persona;
            System.out.println("È uno studente di: " + studenteTemp.getCorso());
        }
        
        // Polimorfismo
        Persona[] persone = {
            new Persona("Luigi", "Verdi", 45, "Torino"),
            new Studente("Anna", "Gialli", 19, "Napoli", "Fisica"),
            new Insegnante("Prof. Blu", "Marco", 50, "Firenze", "Chimica")
        };
        
        for (Persona p : persone) {
            p.saluta(); // Polimorfismo in azione
            
            // Casting condizionale
            if (p instanceof Studente) {
                ((Studente) p).studia();
            } else if (p instanceof Insegnante) {
                ((Insegnante) p).insegna();
            }
        }
    }
}
```

### Precauzioni e Best Practices

```java
public class CastingSicuro {
    public static void main(String[] args) {
        // 1. Perdita di precisione
        double preciso = 9.99999999999999;
        float menoPresiso = (float) preciso;
        System.out.println("Double: " + preciso);
        System.out.println("Float: " + menoPresiso);
        
        // 2. Overflow
        long numeroGrande = 3000000000L;
        int numeroInt = (int) numeroGrande; // Overflow!
        System.out.println("Long: " + numeroGrande);
        System.out.println("Int (overflow): " + numeroInt);
        
        // 3. ClassCastException
        Object oggetto = "Una stringa";
        try {
            Integer numero = (Integer) oggetto; // ClassCastException!
        } catch (ClassCastException e) {
            System.out.println("Errore di casting: " + e.getMessage());
        }
        
        // 4. Casting sicuro con instanceof
        if (oggetto instanceof String) {
            String stringa = (String) oggetto;
            System.out.println("Casting sicuro: " + stringa);
        }
    }
}
```

**Risultato atteso:**
```
Double: 9.99999999999999
Float: 10.0
Long: 3000000000
Int (overflow): -1294967296
Errore di casting: java.lang.String cannot be cast to java.lang.Integer
Casting sicuro: Una stringa
```

### Tabella di Casting

| Da | A | Tipo | Sicuro | Note |
|---|---|---|---|---|
| byte | short, int, long, float, double | Implicito | ✓ | Nessuna perdita |
| short | int, long, float, double | Implicito | ✓ | Nessuna perdita |
| int | long, float, double | Implicito | ✓ | Possibile perdita di precisione con float |
| long | float, double | Implicito | ⚠️ | Possibile perdita di precisione |
| float | double | Implicito | ✓ | Nessuna perdita |
| double | float, long, int, short, byte | Esplicito | ✗ | Perdita di precisione/overflow |
| Superclasse | Sottoclasse | Esplicito | ✗ | Richiede instanceof |

---

## HashMap

### Concetti Base

`HashMap` è una struttura dati che memorizza coppie chiave-valore utilizzando una funzione di hash per mappare le chiavi agli indici. È una delle collezioni più utilizzate in Java.

### Caratteristiche Principali

- **Chiavi uniche**: Ogni chiave può apparire solo una volta
- **Valori duplicati**: I valori possono essere duplicati
- **Ordine non garantito**: Non mantiene l'ordine di inserimento
- **Prestazioni**: O(1) per inserimento, ricerca e rimozione (caso medio)
- **Null values**: Permette una chiave null e valori null

### Operazioni di Base

```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creazione di una HashMap
        HashMap<String, String> capitali = new HashMap<String, String>();
        
        // Inserimento di coppie chiave-valore
        capitali.put("Italia", "Roma");
        capitali.put("Francia", "Parigi");
        capitali.put("Spagna", "Madrid");
        capitali.put("Germania", "Berlino");
        
        System.out.println("=== ACCESSO AI VALORI ===");
        System.out.println("Capitale di Italia: " + capitali.get("Italia"));
        System.out.println("Capitale di Francia: " + capitali.get("Francia"));
        System.out.println("Capitale inesistente: " + capitali.get("Portogallo")); // null
        
        System.out.println("\n=== VERIFICA ESISTENZA ===");
        if (capitali.containsKey("Italia")) {
            System.out.println("✓ L'Italia è presente nella mappa");
        }
        
        if (capitali.containsValue("Roma")) {
            System.out.println("✓ Roma è presente come valore");
        }
        
        System.out.println("\n=== RIMOZIONE ===");
        String rimossa = capitali.remove("Spagna");
        System.out.println("Capitale rimossa: " + rimossa);
        System.out.println("Spagna dopo rimozione: " + capitali.get("Spagna")); // null
        
        System.out.println("\n=== INFORMAZIONI GENERALI ===");
        System.out.println("Dimensione: " + capitali.size());
        System.out.println("È vuota: " + capitali.isEmpty());
        System.out.println("Tutte le coppie: " + capitali);
    }
}
```

**Risultato atteso:**
```
=== ACCESSO AI VALORI ===
Capitale di Italia: Roma
Capitale di Francia: Parigi
Capitale inesistente: null

=== VERIFICA ESISTENZA ===
✓ L'Italia è presente nella mappa
✓ Roma è presente come valore

=== RIMOZIONE ===
Capitale rimossa: Madrid
Spagna dopo rimozione: null

=== INFORMAZIONI GENERALI ===
Dimensione: 3
È vuota: false
Tutte le coppie: {Germania=Berlino, Italia=Roma, Francia=Parigi}
```

### Iterazione su HashMap

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapIterazione {
    public static void main(String[] args) {
        HashMap<String, Integer> eta = new HashMap<>();
        eta.put("Mario", 30);
        eta.put("Alice", 25);
        eta.put("Luigi", 35);
        eta.put("Anna", 28);
        
        System.out.println("=== ITERAZIONE SULLE CHIAVI ===");
        for (String nome : eta.keySet()) {
            System.out.println("Nome: " + nome + ", Età: " + eta.get(nome));
        }
        
        System.out.println("\n=== ITERAZIONE SUI VALORI ===");
        for (Integer anni : eta.values()) {
            System.out.println("Età: " + anni);
        }
        
        System.out.println("\n=== ITERAZIONE SU COPPIE CHIAVE-VALORE ===");
        for (Map.Entry<String, Integer> entry : eta.entrySet()) {
            System.out.println("Chiave: " + entry.getKey() + ", Valore: " + entry.getValue());
        }
        
        System.out.println("\n=== UTILIZZO DI forEach (Java 8+) ===");
        eta.forEach((nome, anni) -> {
            System.out.println(nome + " ha " + anni + " anni");
        });
        
        System.out.println("\n=== OPERAZIONI AVANZATE ===");
        // Valore di default se chiave non esiste
        int etaDefault = eta.getOrDefault("Paolo", 0);
        System.out.println("Età di Paolo (con default): " + etaDefault);
        
        // Inserimento solo se chiave non esiste
        eta.putIfAbsent("Paolo", 32);
        System.out.println("Dopo putIfAbsent: " + eta.get("Paolo"));
        
        // Sostituzione solo se chiave esiste
        eta.replace("Mario", 31);
        System.out.println("Età di Mario dopo replace: " + eta.get("Mario"));
        
        // Clear completo
        eta.clear();
        System.out.println("Dopo clear, è vuota: " + eta.isEmpty());
    }
}
```

**Risultato atteso:**
```
=== ITERAZIONE SULLE CHIAVI ===
Nome: Anna, Età: 28
Nome: Luigi, Età: 35
Nome: Alice, Età: 25
Nome: Mario, Età: 30

=== ITERAZIONE SUI VALORI ===
Età: 28
Età: 35
Età: 25
Età: 30

=== ITERAZIONE SU COPPIE CHIAVE-VALORE ===
Chiave: Anna, Valore: 28
Chiave: Luigi, Valore: 35
Chiave: Alice, Valore: 25
Chiave: Mario, Valore: 30

=== UTILIZZO DI forEach (Java 8+) ===
Anna ha 28 anni
Luigi ha 35 anni
Alice ha 25 anni
Mario ha 30 anni

=== OPERAZIONI AVANZATE ===
Età di Paolo (con default): 0
Dopo putIfAbsent: 32
Età di Mario dopo replace: 31
Dopo clear, è vuota: true
```

### Esempio Pratico: Gestione Inventario

```java
import java.util.HashMap;
import java.util.Scanner;

public class GestioneInventario {
    private HashMap<String, Integer> inventario;
    
    public GestioneInventario() {
        inventario = new HashMap<>();
        // Dati iniziali
        inventario.put("Laptop", 15);
        inventario.put("Mouse", 50);
        inventario.put("Tastiera", 30);
        inventario.put("Monitor", 20);
    }
    
    public void aggiungiProdotto(String prodotto, int quantita) {
        int quantitaAttuale = inventario.getOrDefault(prodotto, 0);
        inventario.put(prodotto, quantitaAttuale + quantita);
        System.out.println("✓ Aggiunto/Aggiornato: " + prodotto + " (Quantità: " + inventario.get(prodotto) + ")");
    }
    
    public void rimuoviProdotto(String prodotto, int quantita) {
        if (inventario.containsKey(prodotto)) {
            int quantitaAttuale = inventario.get(prodotto);
            if (quantitaAttuale >= quantita) {
                inventario.put(prodotto, quantitaAttuale - quantita);
                System.out.println("✓ Rimosso: " + quantita + " " + prodotto + " (Rimanenti: " + inventario.get(prodotto) + ")");
                
                // Rimuovi prodotto se quantità è 0
                if (inventario.get(prodotto) == 0) {
                    inventario.remove(prodotto);
                    System.out.println("⚠️ Prodotto " + prodotto + " rimosso dall'inventario (quantità 0)");
                }
            } else {
                System.out.println("✗ Quantità insufficiente per " + prodotto + " (Disponibili: " + quantitaAttuale + ")");
            }
        } else {
            System.out.println("✗ Prodotto " + prodotto + " non trovato");
        }
    }
    
    public void verificaDisponibilita(String prodotto) {
        int quantita = inventario.getOrDefault(prodotto, 0);
        if (quantita > 0) {
            System.out.println("✓ " + prodotto + ": " + quantita + " disponibili");
        } else {
            System.out.println("✗ " + prodotto + ": non disponibile");
        }
    }
    
    public void mostraInventario() {
        System.out.println("\n=== INVENTARIO COMPLETO ===");
        if (inventario.isEmpty()) {
            System.out.println("Inventario vuoto");
        } else {
            inventario.forEach((prodotto, quantita) -> {
                System.out.println("• " + prodotto + ": " + quantita + " pezzi");
            });
        }
        System.out.println("Totale prodotti diversi: " + inventario.size());
    }
    
    public static void main(String[] args) {
        GestioneInventario gestione = new GestioneInventario();
        
        System.out.println("=== GESTIONE INVENTARIO ===");
        gestione.mostraInventario();
        
        System.out.println("\n=== TEST OPERAZIONI ===");
        gestione.aggiungiProdotto("Webcam", 25);
        gestione.aggiungiProdotto("Laptop", 5); // Aggiunge a esistente
        
        gestione.verificaDisponibilita("Mouse");
        gestione.verificaDisponibilita("Stampante");
        
        gestione.rimuoviProdotto("Mouse", 45);
        gestione.rimuoviProdotto("Monitor", 25); // Quantità insufficiente
        
        gestione.mostraInventario();
    }
}
```

**Risultato atteso:**
```
=== GESTIONE INVENTARIO ===

=== INVENTARIO COMPLETO ===
• Laptop: 15 pezzi
• Mouse: 50 pezzi
• Tastiera: 30 pezzi
• Monitor: 20 pezzi
Totale prodotti diversi: 4

=== TEST OPERAZIONI ===
✓ Aggiunto/Aggiornato: Webcam (Quantità: 25)
✓ Aggiunto/Aggiornato: Laptop (Quantità: 20)
✓ Mouse: 50 disponibili
✗ Stampante: non disponibile
✓ Rimosso: 45 Mouse (Rimanenti: 5)
✗ Quantità insufficiente per Monitor (Disponibili: 20)

=== INVENTARIO COMPLETO ===
• Laptop: 20 pezzi
• Mouse: 5 pezzi
• Tastiera: 30 pezzi
• Monitor: 20 pezzi
• Webcam: 25 pezzi
Totale prodotti diversi: 5
```

---

## Iterator

### Concetti Base

L'`Iterator` è un'interfaccia che fornisce un modo standard per attraversare collezioni (come `ArrayList`, `HashSet`, ecc.) in modo sicuro e controllato.

### Vantaggi dell'Iterator

- **Sicurezza**: Evita `IndexOutOfBoundsException`
- **Universalità**: Funziona con tutte le collezioni
- **Rimozione sicura**: Permette di rimuovere elementi durante l'iterazione
- **Fail-fast**: Rileva modifiche concorrenti

### Utilizzo Base

```java
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Creazione di un ArrayList
        ArrayList<String> nomi = new ArrayList<>();
        
        // Aggiunta elementi
        nomi.add("Mario");
        nomi.add("Alice");
        nomi.add("Luigi");
        nomi.add("Anna");
        nomi.add("Paolo");
        
        System.out.println("=== ITERAZIONE CON ITERATOR ===");
        Iterator<String> iterator = nomi.iterator();
        
        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println("Nome: " + nome);
        }
        
        System.out.println("\n=== RIMOZIONE SICURA DURANTE ITERAZIONE ===");
        Iterator<String> iterator2 = nomi.iterator();
        
        while (iterator2.hasNext()) {
            String nome = iterator2.next();
            if (nome.startsWith("A")) {
                iterator2.remove(); // Rimozione sicura
                System.out.println("Rimosso: " + nome);
            }
        }
        
        System.out.println("Lista dopo rimozione: " + nomi);
    }
}
```

**Risultato atteso:**
```
=== ITERAZIONE CON ITERATOR ===
Nome: Mario
Nome: Alice
Nome: Luigi
Nome: Anna
Nome: Paolo

=== RIMOZIONE SICURA DURANTE ITERAZIONE ===
Rimosso: Alice
Rimosso: Anna
Lista dopo rimozione: [Mario, Luigi, Paolo]
```

### Esempio Pratico: Filtraggio Numeri

```java
import java.util.ArrayList;
import java.util.Iterator;

public class FiltraggioNumeri {
    public static void main(String[] args) {
        // Creazione lista di numeri
        ArrayList<Integer> numeri = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeri.add(i);
        }
        
        System.out.println("Lista originale: " + numeri);
        
        // Rimozione numeri pari usando Iterator
        Iterator<Integer> iterator = numeri.iterator();
        System.out.println("\n=== RIMOZIONE NUMERI PARI ===");
        
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            
            if (numero % 2 == 0) { // Se il numero è pari
                iterator.remove();
                System.out.println("Rimosso numero pari: " + numero);
            } else {
                System.out.println("Mantenuto numero dispari: " + numero);
            }
        }
        
        System.out.println("\nLista dopo filtro: " + numeri);
        
        // Esempio di cosa NON fare (ConcurrentModificationException)
        System.out.println("\n=== ESEMPIO DI ERRORE (commentato) ===");
        /*
        for (Integer num : numeri) {
            if (num > 5) {
                numeri.remove(num); // ConcurrentModificationException!
            }
        }
        */
        System.out.println("Il codice sopra causerebbe ConcurrentModificationException");
    }
}
```

**Risultato atteso:**
```
Lista originale: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

=== RIMOZIONE NUMERI PARI ===
Mantenuto numero dispari: 1
Rimosso numero pari: 2
Mantenuto numero dispari: 3
Rimosso numero pari: 4
Mantenuto numero dispari: 5
Rimosso numero pari: 6
Mantenuto numero dispari: 7
Rimosso numero pari: 8
Mantenuto numero dispari: 9
Rimosso numero pari: 10

Lista dopo filtro: [1, 3, 5, 7, 9]

=== ESEMPIO DI ERRORE (commentato) ===
Il codice sopra causerebbe ConcurrentModificationException
```

### ListIterator per Operazioni Avanzate

```java
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> parole = new ArrayList<>();
        parole.add("java");
        parole.add("python");
        parole.add("javascript");
        parole.add("c++");
        
        System.out.println("Lista originale: " + parole);
        
        // ListIterator permette navigazione bidirezionale
        ListIterator<String> listIterator = parole.listIterator();
        
        System.out.println("\n=== NAVIGAZIONE IN AVANTI ===");
        while (listIterator.hasNext()) {
            int indice = listIterator.nextIndex();
            String parola = listIterator.next();
            System.out.println("Indice " + indice + ": " + parola);
            
            // Modifica elementi durante iterazione
            if (parola.equals("java")) {
                listIterator.set("JAVA"); // Modifica elemento corrente
                System.out.println("  → Modificato in: JAVA");
            }
            
            // Aggiunta elementi
            if (parola.equals("python")) {
                listIterator.add("kotlin"); // Aggiunge dopo elemento corrente
                System.out.println("  → Aggiunto kotlin dopo python");
            }
        }
        
        System.out.println("\nLista dopo modifiche: " + parole);
        
        System.out.println("\n=== NAVIGAZIONE ALL'INDIETRO ===");
        while (listIterator.hasPrevious()) {
            int indice = listIterator.previousIndex();
            String parola = listIterator.previous();
            System.out.println("Indice " + indice + ": " + parola);
        }
    }
}
```

**Risultato atteso:**
```
Lista originale: [java, python, javascript, c++]

=== NAVIGAZIONE IN AVANTI ===
Indice 0: java
  → Modificato in: JAVA
Indice 1: python
  → Aggiunto kotlin dopo python
Indice 3: javascript
Indice 4: c++

Lista dopo modifiche: [JAVA, python, kotlin, javascript, c++]

=== NAVIGAZIONE ALL'INDIETRO ===
Indice 4: c++
Indice 3: javascript
Indice 2: kotlin
Indice 1: python
Indice 0: JAVA
```

### Confronto tra Metodi di Iterazione

```java
import java.util.ArrayList;
import java.util.Iterator;

public class ConfrontoIterazione {
    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numeri.add(i);
        }
        
        System.out.println("=== CONFRONTO METODI DI ITERAZIONE ===");
        
        // Metodo 1: For tradizionale
        System.out.println("\n1. For tradizionale:");
        for (int i = 0; i < numeri.size(); i++) {
            System.out.println("  " + numeri.get(i));
        }
        
        // Metodo 2: Enhanced for (for-each)
        System.out.println("\n2. Enhanced for (for-each):");
        for (Integer numero : numeri) {
            System.out.println("  " + numero);
        }
        
        // Metodo 3: Iterator
        System.out.println("\n3. Iterator:");
        Iterator<Integer> iterator = numeri.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }
        
        // Metodo 4: forEach con lambda (Java 8+)
        System.out.println("\n4. forEach con lambda:");
        numeri.forEach(numero -> System.out.println("  " + numero));
        
        System.out.println("\n=== QUANDO USARE QUALE METODO ===");
        System.out.println("• For tradizionale: quando serve l'indice");
        System.out.println("• Enhanced for: lettura semplice, codice pulito");
        System.out.println("• Iterator: quando serve rimuovere elementi");
        System.out.println("• forEach lambda: stile funzionale, operazioni complesse");
    }
}
```

---

## Best Practices

### 1. Nomenclatura e Convenzioni

```java
// ✓ CORRETTO
public class CalcolatoreMatematico {
    private static final double PI = 3.14159;
    private int numeroElementi;
    
    public double calcolaAreaCerchio(double raggio) {
        return PI * raggio * raggio;
    }
}

// ✗ SCORRETTO
public class calcolatore {
    private static final double pi = 3.14159;
    private int n;
    
    public double calc(double r) {
        return pi * r * r;
    }
}
```

### 2. Gestione degli Errori

```java
// ✓ CORRETTO
public class FileManager {
    public String leggiFile(String percorso) {
        try (BufferedReader reader = new BufferedReader(new FileReader(percorso))) {
            return reader.readLine();
        } catch (IOException e) {
            System.err.println("Errore lettura file: " + e.getMessage());
            return null;
        }
    }
}

// ✗ SCORRETTO
public class FileManager {
    public String leggiFile(String percorso) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(percorso));
            String linea = reader.readLine();
            // Dimenticato di chiudere il file!
            return linea;
        } catch (Exception e) {
            // Gestione generica degli errori
            return null;
        }
    }
}
```

### 3. Uso Corretto delle Collezioni

```java
// ✓ CORRETTO
public class GestioneStudenti {
    private List<Studente> studenti = new ArrayList<>();
    private Map<String, Studente> studentiPerCodice = new HashMap<>();
    
    public void aggiungiStudente(Studente studente) {
        if (studente != null && !studentiPerCodice.containsKey(studente.getCodice())) {
            studenti.add(studente);
            studentiPerCodice.put(studente.getCodice(), studente);
        }
    }
    
    public Optional<Studente> trovaStudente(String codice) {
        return Optional.ofNullable(studentiPerCodice.get(codice));
    }
}
```

### 4. Principi SOLID

```java
// Single Responsibility Principle
public class EmailService {
    public void inviaEmail(String destinatario, String messaggio) {
        // Solo responsabilità di invio email
    }
}

public class EmailValidator {
    public boolean isValidEmail(String email) {
        // Solo responsabilità di validazione
        return email.contains("@") && email.contains(".");
    }
}

// Open/Closed Principle
public abstract class CalcolatoreSconto {
    public abstract double calcolaSconto(double prezzo);
}

public class ScontoPercentuale extends CalcolatoreSconto {
    private double percentuale;
    
    public ScontoPercentuale(double percentuale) {
        this.percentuale = percentuale;
    }
    
    @Override
    public double calcolaSconto(double prezzo) {
        return prezzo * (percentuale / 100);
    }
}
```

### 5. Documentazione e Commenti

```java
/**
 * Classe per la gestione di operazioni matematiche avanzate.
 * Fornisce metodi per calcoli geometrici e statistici.
 * 
 * @author Il Tuo Nome
 * @version 1.0
 * @since 2024
 */
public class CalcolatoreAvanzato {
    
    /**
     * Calcola l'area di un cerchio dato il raggio.
     * 
     * @param raggio Il raggio del cerchio (deve essere > 0)
     * @return L'area del cerchio
     * @throws IllegalArgumentException se il raggio è negativo o zero
     */
    public double calcolaAreaCerchio(double raggio) {
        if (raggio <= 0) {
            throw new IllegalArgumentException("Il raggio deve essere positivo");
        }
        
        return Math.PI * Math.pow(raggio, 2);
    }
    
    /**
     * Calcola la media di un array di numeri.
     * 
     * @param numeri Array di numeri (non deve essere null o vuoto)
     * @return La media aritmetica
     * @throws IllegalArgumentException se l'array è null o vuoto
     */
    public double calcolaMedia(double[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("L'array non può essere null o vuoto");
        }
        
        double somma = 0;
        for (double numero : numeri) {
            somma += numero;
        }
        
        return somma / numeri.length;
    }
}
```

## Conclusione

Questa guida completa copre i concetti fondamentali della programmazione Java, dalle basi della sintassi ai concetti avanzati come l'ereditarietà, le classi astratte e le collezioni. Java è un linguaggio potente e versatile che offre molte funzionalità per sviluppare applicazioni robuste e scalabili.

### Prossimi Passi

1. **Pratica costante**: Implementa i concetti appresi con progetti personali
2. **Approfondimento**: Studia argomenti avanzati come Generics, Lambda expressions, Stream API
3. **Framework**: Esplora Spring, Hibernate e altri framework Java
4. **Testing**: Impara JUnit e le best practices del testing
5. **Progetti reali**: Partecipa a progetti open source o sviluppa applicazioni complete

### Risorse Utili

- **Documentazione ufficiale**: [docs.oracle.com/javase](https://docs.oracle.com/javase/)
- **IDE consigliati**: IntelliJ IDEA, Eclipse, Visual Studio Code


Buona programmazione! 🚀