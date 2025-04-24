package PadelNormal;

public class Main {
    public static void main(String[] args) {
    Pista pista =new Pista(4);
        int hilo=1;

        for (int i = 1; i <5 ; i++) {

            new Jugador(pista,hilo).start();
        }

    }
}
