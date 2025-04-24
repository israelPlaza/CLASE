package PadelNormal;

public class Jugador extends Thread {
    private Pista pista;
    private int hilo;
    public Jugador(Pista pista, int hilo){
        this.pista=pista;
        this.hilo=hilo;
    }
    public void run(){
        try {
            pista.jugar();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
