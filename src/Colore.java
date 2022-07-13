public class Colore {
    /* Progettare una classe Colore, che permette di
    • Rappresentare un colore con i valori RGB (0-255)
    • Esporre due costanti, BIANCO e NERO
    Aggiungere il colore alle classi Quadrato e Cerchio
    • Che di default sia NERO
    • Che sia modificabile
*/
    private final int[] BIANCO = {255, 255, 255};
    private final int[] NERO = {0, 0, 0};
    private int[] colore;

    public Colore() {
        colore = NERO;
    }

    public void setColore(int r, int g, int b) {
        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255) {
            this.colore[0] = r;
            this.colore[1] = g;
            this.colore[2] = b;
        }
    }

    public int[] getColore() {
        return colore;
    }

    public String toString() {
        return "Colore RGB: (" + colore[0] + ", " + colore[1] + ", " + colore[2] + ")";
    }
}
