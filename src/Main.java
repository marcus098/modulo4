import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Corrente.cambia();
        //Esercizio 1 Contatore
        System.out.println("Esercizio 1: ");
        Contatore contatore = new Contatore();
        Contatore contatore1 = new Contatore(5);
        System.out.println(contatore);
        System.out.println(contatore1);
        contatore.increment();
        System.out.println(contatore);
        contatore1.reset();
        System.out.println(contatore1);
        contatore.setCount(10);
        System.out.println(contatore);
        System.out.println(contatore.getCount());
        //Esercizio 2 Forme
        System.out.println("Esercizio 2: ");
        Cerchio cerchio = new Cerchio(5);
        System.out.println("Circonferenza: " + cerchio.circonferenza());
        System.out.println("Area Cerchio: " + cerchio.area());
        System.out.println(cerchio);
        Quadrato quad = new Quadrato(4);
        System.out.println("Perimetro: " + quad.perimetro());
        System.out.println(quad);
        //Esercizio 3 Forme2
        System.out.println("Esercizio 3: ");
        Colore colore = new Colore();
        colore.setColore(2, 5, 10);
        quad.setColore(colore);
        System.out.println(quad);
        //Esercizio 4 Lampadina
        System.out.println("Esercizio 4: ");
        Lampadina lampadina = new Lampadina(5);
        System.out.println(lampadina);
        lampadina.click();
        System.out.println(lampadina.getSt());
        lampadina.click();
        lampadina.click();
        lampadina.click();
        lampadina.click();
        lampadina.click();
        System.out.println(lampadina);
        //Esercizio 5 Lampadina2
        System.out.println("Esercizio 5: ");
        Lampadina lampadina1 = new Lampadina(6);
        Interruttore interruttore = new Interruttore(lampadina1);
        Interruttore interruttore1 = new Interruttore(lampadina1);
        interruttore1.accendiSpegni();
        System.out.println(interruttore1);
        interruttore.accendiSpegni();
        System.out.println(interruttore);
        //Esercizio 6 Lampadina3

        /*System.out.println("Esercizio 6: ");
        Corrente.cambia();//stacco la corrente
        System.out.println(lampadina);
        System.out.println(lampadina1);
        lampadina1.click();
        System.out.println(lampadina1);
        Corrente.cambia();//attacco la corrente
        System.out.println(lampadina);
        System.out.println(lampadina1);
        lampadina1.click();
        System.out.println(lampadina1);*/
        Scanner sc = new Scanner(System.in);
        int n = -1;
        boolean exit = false;
        Random rnd = new Random();
        while(!exit) {
            n=-1;
            if(rnd.nextBoolean())
                Corrente.cambia();
            System.out.println("CORRENTE: " + Corrente.getCorrente());
            while(n<=0 || n>3) {
                System.out.println("Click su: \n1. interruttore1\n2. interruttore2\n3.Esci");
                n = sc.nextInt();
            }
            if(n==3){
                exit = true;
                break;
            }
            if(n==1)
                interruttore.accendiSpegni();
            if(n==2)
                interruttore1.accendiSpegni();
            System.out.println("Int1: " + interruttore);
            System.out.println("Int2: " + interruttore1);
        }
    }
}
