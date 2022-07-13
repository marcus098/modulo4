public class Corrente {
    private static boolean corrente = false;
    public static void cambia(){
        corrente = corrente ? false : true;
    }

    public static boolean getCorrente(){
        return corrente;
    }

}
