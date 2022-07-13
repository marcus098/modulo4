public class Quadrato {
    /*Progettare una classe Quadrato, che permetta di
• Istanziare la classe con la dimensione del lato del quadrato
• Ottenere il perimetro del quadrato
• Stampare il quadrato sulla console*/
    private double lato;
    private Colore colore;

    public Quadrato(double lato) {
        this.lato = lato;
        colore = new Colore();
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }

    public double perimetro() {
        return (this.lato * 4);
    }

    public void quadrato() {
        System.out.println("Quadrato: " + lato*lato);
    }

    public String toString() {
        return "Quadrato con lato: " + lato + ", " + colore.toString();
    }
}
