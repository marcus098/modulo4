public class Contatore {
    /*Progettare una classe Contatore che permetta di
    • Istanziare la classe con un valore iniziale
    • Istanziare la classe senza un valore iniziale
    • Incrementare il conteggio attuale
    • Ottenere il conteggio attuale
    • Resettare il conteggio a zero
    • Resettare il conteggio ad un altro valore*/
    private int count = 0;

    //costruttori
    public Contatore() {//Istanziare la classe senza un valore iniziale
        this.count = 0;
    }
    public Contatore(int count) {//Istanziare la classe con un valore iniziale
        this.count = count;
    }

    public void increment() {//Incrementare il conteggio attuale
        count++;
    }
    public int getCount() {//Ottenere il conteggio attuale
        return count;
    }
    public void reset() {//Resettare il conteggio a zero
        count = 0;
    }
    public void setCount(int count) {//Resettare il conteggio ad un altro valore
        this.count = count;
    }

    public String toString() {
        return "" + count;
    }
}
