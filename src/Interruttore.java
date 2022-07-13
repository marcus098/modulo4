public class Interruttore {
    /*Progettare una classe Interruttore che rappresenta un
interruttore per la lampadina fatta precedentemente
• Ogni interruttore è collegato ad una lampadina e ne regola
accensione e spegnimento
• Definite quali campi, metodi e costruttori siano opportuni
• Creare un metodo di test che istanzia due interruttori e li
collega alla stessa lampadina e poi offre all’utente
ripetutamente la possibilità di clickare uno dei due interruttori
oppure di terminare l’esecuzione
*/
    Lampadina lamp;
    public Interruttore(Lampadina lamp){
        this.lamp = lamp;
    }

    public void accendiSpegni(){
        lamp.click();
    }

    public String toString() {
        return lamp.toString();
    }
}
