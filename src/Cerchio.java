public class Cerchio {
    /*Progettare una classe Cerchio, che permetta di
    • Istanziare la classe con un costruttore che accetta un parametro
    • Ottenere la circonferenza del cerchio
    • Ottenere l’area del cerchio
    */
    private double raggio;
    private Colore colore;

    public Cerchio(double raggio) {
        this.raggio = raggio;
        colore = new Colore();
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }

    public double circonferenza() {
        return (Math.PI * raggio * 2);
    }

    public double area() {
        return (Math.PI * (raggio * raggio));
    }

    public String toString() {
        return "Cerchio con raggio: " + raggio + ", " + colore.toString();
    }
}
