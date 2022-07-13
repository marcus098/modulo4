public class Lampadina {
    /*Progettare una classe Lampadina che rappresenti una
lampadina elettrica
• La lampadina può essere accesa, spenta o rotta
• Espone due metodi
• stato() che indica lo stato corrente della lampadina
• click() che cambia lo stato da accesa a spenta o da spenta
ad accesa, oppure rompe la lampadina
• Una lampadina si rompe dopo un numero di click
definito dal produttore
• La classe deve contenere uno o più campi che ne descrivano
lo stato
• Un costruttore
• I metodi indicati sopra
*/
    private enum STATO {ACCESA, SPENTA, ROTTA}

    public static boolean correnteLamp;

    private STATO st;
    private int nClick, count;

    public Lampadina(int nClick) {
       // stato = "Spenta";
        this.nClick = nClick;
        count = 0;
        st = STATO.SPENTA;
    }

    public STATO getSt() {
        return st;
    }

    public void click() {
        if (st != STATO.ROTTA && Corrente.getCorrente()) {
            st = st==STATO.ACCESA ? STATO.SPENTA : STATO.ACCESA;
            count++;
        }
        if (count == nClick)
            st = STATO.ROTTA;
    }

    public String toString() {
        return "La lampadina e': " + st;
    }
}
